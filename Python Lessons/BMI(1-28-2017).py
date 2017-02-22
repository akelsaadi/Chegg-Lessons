def bmi():
    output = open("bmi_results.txt", 'w+')
    name =  input("Please enter your name: ")
    weight = int(input("Please enter your weight in pounds: "))
    print("Next, enter your height in feet and inches:")
    feet = int(input("Enter feet: "))
    inches = int(input("Enter inches: "))
    mass = (weight * 0.454)
    height = (((feet * 12) + (inches)) * 0.0254)
    BMI = (mass/(height*height))
    output.write(name + ", " + str(feet) + "." + str(inches) + ", " + str(BMI) + ", ")
    if BMI < 18.5:
        output.write("Underweight")
    elif BMI >= 18.5 and BMI < 25:
        output.write("Normal Weight")
    elif BMI >= 25 and BMI < 30:
        output.write("OverWeight")
    elif BMI >= 30:
        output.write("Obese")
    output.close()
bmi()