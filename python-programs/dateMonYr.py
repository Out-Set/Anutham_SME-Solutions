def get_written_date(date_list):
    month_names = { 
        1: "January", 
        2: "February", 
        3: "March", 
        4: "April", 
        5 : "May",
        6 : "June" , 
        7 : "July" , 
        8: "August" , 
        9 : "September", 
        10 : "October",
        11 : "November", 
        12 : "December" 
        }

    return month_names[int(date_list[0])]+ " " + str(int(date_list[1])) + ", " + date_list[2]   


# calling get_written_date(date_list) and printing desired format
print(get_written_date(["01", "02", "2022"]))
print(get_written_date(["01", "12", "1970"]))
print(get_written_date(["04", "14", "2020"]))
print(get_written_date(["06", "19", "2000"]))

