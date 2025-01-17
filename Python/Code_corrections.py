x = "awesome"

def myfunc():
  global x
  x = "fantastic"

myfunc()

print("Python is " + x)

q = 'bull'

def m_f_f():
    global q
    q = 'shit'

m_f_f()
print('pythonis'+ q)
