from openai import OpenAI
firsthalf = "sk-85TEYwwk84UOVYQAFUI0T"
lasthalf = "3BlbkFJoKgnY0uBN4s5zGmjG3Hs"
api = firsthalf + lasthalf
client = OpenAI(
    api_key=api
    )

completion = client.chat.completions.create(
  model="gpt-3.5-turbo",
  messages=[
    {"role": "system", "content": "You are a complex assistant to help generate FIRST FRC Robot code."},
    {"role": "user", "content": "Compose a simple RobotContainer file to start a FRC Robot with."}
  ]
)

print(completion.choices[0].message)