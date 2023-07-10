# edit


dividendo = 5
divisor = 3

print("Bregando con módulo")
print('División de dividendo ({}) sobre divisor ({}):'.format(dividendo,divisor))

cociente = int(dividendo/divisor) # Python automáticamente trataría esto como double.
residuo = dividendo%divisor

# print (cociente)
# print (divisor)

print (f"Cociente, dividendo sobre divisor, ({dividendo} / {divisor}): {cociente}")
print (f"Residuo, dividendo módulo divisor, ({dividendo} % {divisor}): {residuo}")
print (f"Fracción, residuo sobre divisor, ({residuo} / {divisor}): {residuo / divisor}")
print (f"Cociente menos la fracción: {dividendo / divisor - residuo / divisor}")
