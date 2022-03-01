"""Faviola Bautista
This program takes in 3 sides and determines if it is a right triangle, or if its equilateral
"""

#taking in lengths
side1 = float (input("Enter side one of triangle: "))
side2 = float (input("Enter side two: "))
side3 = float (input("Enter side three: "))
print()

#if negative numbers state they cant be allowed, if not print out if equilateral or not
if (side1 < 0 or side2 < 0 or side3 < 0):
    print("No negative numbers")

else:
    
    if(side1 == side2 == side3):
        print("Equilateral triangle")

    else:
        print("Not equilateral triangle")


#taking in legs and hypotenus of triangle
print()
leg1 = float(input("Enter the first leg of the triangle: "))
leg2 = float(input("Enter the second leg of the trinangle: "))
hyp = float(input("Enter the hypotenus of the triangle: "))
print()

#if negative numbers state not allowed, then determine if it is a right  triangle or not
if (leg1 < 0 or leg2 < 0 or hyp < 0):
    print("No negative numbers")

else:
    
    if((leg1 ** 2) + (leg2 ** 2) == hyp ** 2):
        print("Right triangle")

    else:
        print("Not right triangle")
