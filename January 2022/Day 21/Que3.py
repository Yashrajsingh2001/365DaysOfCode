# Que link: https://www.hackerrank.com/challenges/grading/problem
# Grading Students


def gradingStudents(grades):
    for i in range(len(grades)):
        if grades[i]>37:
            mod5 = grades[i] % 5
            if mod5 >= 3:
                grades[i] += (5 - mod5)
    return grades