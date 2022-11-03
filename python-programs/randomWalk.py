import turtle as ts
from math import sqrt
from random import choices, seed
from statistics import mean, stdev
from sys import argv
import tempfile
import subprocess

def save_to_image(dest='random_walk.png'):
    '''Saves the turtle canvas to dest. Do not modify this function.'''
    with tempfile.NamedTemporaryFile(prefix='random_walk',
                                     suffix='.eps') as tmp:
        ts.getcanvas().postscript(file=tmp.name)
        subprocess.run(['gs',
                        '-dSAFER',
                        '-o',
                        dest,
                        '-r200',
                        '-dEPSCrop',
                        '-sDEVICE=png16m',
                        tmp.name],
                       stdout=subprocess.DEVNULL)

def get_args() -> tuple:
    walk_lengths = list(map(int, argv[1].split(',')))
    n = int(argv[2])
    walker_name = argv[3]
    return (walk_lengths, n, walker_name)


class RandomWalker:
    '''
    Class to represent the random walker.
    '''
    directions = dict(
        North=[0, +1],
        South=[0, -1],
        East=[+1, 0],
        West=[-1, 0],
    )

    def __init__(self, name, N, S, E, W, color, shape) -> None:
        '''
        Initialisation function
            Parameters:
                name (str) : name of random walker
                N,S,E,W (int) : weights for moving in the specified direction
                color (str) : color for plot representation
                shape (str) : shape for plot representation
        '''
        self.name = name
        self.N = N
        self.S = S
        self.E = E
        self.W = W
        self.color = color
        self.shape = shape

    def take_walk(self, walk_length, n) -> list:
        '''
        Takes a random walk
            Parameters:
                walk_length (int): Length of random walk
            Returns:
                List of final destinations
        '''
        walker_weight = (self.N, self.S, self.E, self.W)
        directions = list(RandomWalker.directions.keys())
        final_postions = []

        for _ in range(n):
            position = [0, 0]
            for step in range(walk_length):
                random_direction = choices(
                    directions, weights=walker_weight, k=1)[0]
                delta_direction = RandomWalker.directions[random_direction]
                position[0] += delta_direction[0]
                position[1] += delta_direction[1]
            final_postions.append(position)

        final_distances = list(map(lambda pos: sqrt(
            pos[0]**2 + pos[1]**2), final_postions))

        Mean = mean(final_distances)
        CV = stdev(final_distances)/Mean
        Max = max(final_distances)
        Min = min(final_distances)

        print(f'{self.name} random walk of {walk_length} steps\nMean = {Mean:.1f} CV = {CV:.1f}\nMax = {Max:.1f} Min = {Min:.1f}')

        return final_postions

    @staticmethod
    def get_walkers(walker_name: str) -> list:
        '''
        Returns the instances of the RandomWalkers
            Parameters:
                walker_name: mentions the random_walker; 'all' for all walkers
            Returns:
                A list containing instance of random walkers.
        '''
        walkers = {
            'Pa': RandomWalker('Pa', 1, 1, 1, 1, 'black', 'circle'),
            'Mi-Ma': RandomWalker('Mi-Ma', 1, 2, 1, 1, 'green', 'square'),
            'Reg': RandomWalker('Reg', 0, 0, 1, 1, 'red', 'triangle'),
        }
        if walker_name in walkers:
            return [(walkers[walker_name])]
        elif walker_name == 'all':
            return list(walkers.values())
        else:
            raise Exception(f'Inavlid walker_name, "{walker_name}"')


def simulate(walk_lengths: list, n: int, walker_name: str) -> list:
    '''
    Simulating random walks
        Parameters:
            walk_lengths (list) : length of random walks to simulate
            n (int) : number of random walks to simulate
            walker_name (str) : mentions the random_walker; 'all' for all walkers
        Returns:
            Data for plotting (list) of form [shape, color, final_postions, walk_length]
    '''
    walkers = RandomWalker.get_walkers(walker_name)

    data_for_plotting = []
    for walker in walkers:
        for walk_length in walk_lengths:
            final_postion = walker.take_walk(walk_length, n)
            data_for_plotting.append(
                [walker.shape, walker.color, final_postion, walk_length])
    return data_for_plotting


def plot(data_for_plotting: list = []) -> None:
    '''
    Function to plot
        Parameters:
            data_for_plotting (list) of form [shape, color, final_postions, walk_length]
    '''

    ts.screensize(300, 400)
    turtle = ts.Turtle()
    turtle.speed(0)
    turtle.shapesize(0.5, 0.5)
    turtle.up()



    for shape, color, positions, walk_length in data_for_plotting:

        if walk_length > 100:
            continue

        turtle.shape(shape)
        turtle.color(color)

        for position in positions:
            x, y = position
            scale = 5
            turtle.goto(x*scale, y*scale)
            turtle.stamp()

    save_to_image()
def main():
    plotting_data = simulate(*get_args())
    plot(plotting_data)

if __name__ == "__main__":
    main()