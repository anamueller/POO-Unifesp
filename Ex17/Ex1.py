import csv

k = int(input())
arquivo = ('/home/anaclara/Desktop/Study/VS Codes/POO/Ex17/teste.csv')
ler = open(arquivo, 'r')
arquivo2 = open('criptografado.csv','w')
for lines in ler:
    j = ord(lines[0])
    caracter_cripto = j + k
    if caracter_cripto>255:
        caracter_cripto = caracter_cripto - 255
    arquivo2.write(chr(caracter_cripto))
    arquivo2.write("\n")