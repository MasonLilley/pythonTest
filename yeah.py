import re
from openai import OpenAI
firsthalf = "sk-85TEYwwk84UOVYQAFUI0T"
lasthalf = "3BlbkFJoKgnY0uBN4s5zGmjG3Hs"
api = firsthalf + lasthalf
client = OpenAI(
    api_key=api
    )

#robot w joystick
completion = client.chat.completions.create(
  model="gpt-3.5-turbo",
  messages=[
    {"role": "system", "content": "You are a complex assistant to help generate FIRST FRC Robot code."},
    {"role": "user", "content": "Make a simple swerve drivetrain class using the previous swerveModule class. No biolerplate, no greeting, ONLY text should be the robot code. No explaining what it does."}
  ]
)

#longest possible
# completion = client.chat.completions.create(
#   model="gpt-3.5-turbo",
#   messages=[
#     {"role": "system", "content": "dsankfewnaunfhie ahsihfeiua"},
#     {"role": "user", "content": "jkfhdjkshfhiauerhiufuahiohroueah"}
#   ]
# )

returnValue = completion.choices[0].message

# for (i = 0; i < returnValue.len(); ) {
    
# }


returnValue = returnValue.content
print(returnValue)
# returnValue = returnValue.replace("\\n", "\n")


# result = re.search(r'(?<=```java)(.*?)(?=```)', returnValue)



#textFile = result.group(1)



# if result:
#     extracted_text = result.group(1)

#     # Writing the extracted text to a file

returnValue = returnValue.replace("```java", "")
returnValue = returnValue.replace("```", "")

with open("swerveDrivetrain.java", "w") as file:
  file.write(returnValue)