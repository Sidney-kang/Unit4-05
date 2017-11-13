# Created by : Sidney Kang
# Created on : 6 Nov. 2017
# Created for : ICS3UR
# Daily Assignment - Unit4-05
# This program calculates area of cylinder

import math

def calculate_cylinder_area(height, radius):
	
    #constant
    constant = 2 * math.pi
    volume_of_cylinder = float(height * constant * (radius ** 2))
    
    return volume_of_cylinder
    
height = raw_input("Enter the height of the cylinder: ")
height = int(height)
radius = raw_input("Enter the radius of the cylinder: ")
radius = int(radius)

calculate_cylinder_area(height, radius)

volume = calculate_cylinder_area(height, radius)
print("Volume is: " + str(volume) + " units^3")

