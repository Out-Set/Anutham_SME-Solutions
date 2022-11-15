class Course:
    def __init__(self,title,term,enrollment):
        self.title=title
        self.term=term
        self.enrollment=enrollment
        
myCourse=Course("python programming","fall","20")
print("Title: ",myCourse.title)
print("Term: ",myCourse.term)

