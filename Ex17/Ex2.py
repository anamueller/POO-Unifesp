import csv

arquivo = ('/home/anaclara/Desktop/Study/VS Codes/POO/Ex17/teste.csv')
ler = open(arquivo, 'r')
contas = open('caracteristicas.csv','w')
linhas = 0
vogais = 0
letras = 0
consoantes = 0
numeros = 0
especiais = 0
j = 0
for lines in ler:
    linhas = linhas + 1
    for caracter in lines:
        try: 
            int(caracter[j])
            numeros = numeros + 1
        except ValueError:
            letras = letras + 1
        if 0<ord(caracter[j])<48 or 57<ord(caracter[j])<65 or 122<ord(caracter[j]):
            especiais = especiais + 1
        if ord(caracter[j])==65 or ord(caracter[j])==69 or ord(caracter[j])==73 or ord(caracter[j])==79 or ord(caracter[j])==85 or ord(caracter[j])==97 or ord(caracter[j])==101 or ord(caracter[j])==105 or ord(caracter[j])==111 or ord(caracter[j])==117:
            vogais = vogais + 1
        else:
            consoantes= consoantes + 1 
letra = str(letras)
vogal= str(vogais)
consoante = str(consoantes)
numero = str(numeros)
especial = str(especiais)
linha = str(linhas)
final = 'O arquivo possui:\nLetras: '+letra+'\nVogais: '+vogal+'\nConsoantes: '+consoante+'\nNúmeros: '+numero+'\nCaracteres especiais: '+especial+'\nLinhas: '+linha
contas.write(final)