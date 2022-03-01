"""Faviola Bautista
This program takes in a salary and percent increase and shoes the salary increase
for expected number of years"""


#takes in salary and increase
salary = float(input("Enter starting salary: "))
perInc = float(input("Enter percent increase: "))


#changing number into decimal
if perInc >= 1:
    perInc = perInc / 100


#checking invalid data
if perInc < 0 or salary < 0:
    print()
    print("No negative salary or percent increase.")
    
#Takes in years and formats it into table
else:
    years = int(input("Enter number of years: "))
    print()
    print("%6s%7s" % \
          ("Year", "Salary"))

    for count in range(1, years + 1):
        if(years <= 10 and years != 1):
            salary = (salary * perInc) + salary

    
        print("%-5d%8f" % \
              (count, salary))

    


