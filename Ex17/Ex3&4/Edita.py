import re
import codecs

class Edita:
  def ex1(origem, k):
    file = open(origem, 'r')
    texto = file.read()
    print(texto)
    for i in range(len(texto)):
      print(chr(ord(texto[i])+k), end='')
    file.close()

  def ex2(origem, destino):
    origem = open(origem, 'r')
    origem = origem.read()
    vogais = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']
    vogais_num = 0
    consoantes_num = 0
    numerais_num = 0
    demais_num = 0
    for i in range(len(origem)):
      if origem[i] in vogais:
        vogais_num += 1
      elif (ord(origem[i]) >= 65 and ord(origem[i]) <= 90) or (ord(origem[i]) >= 97 and ord(origem[i]) <= 122):
        consoantes_num += 1
      elif (ord(origem[i]) >= 48 and ord(origem[i]) <= 57):
        numerais_num += 1
      else:
        demais_num += 1
    lista_de_palavras = origem.split()
    lista_de_linhas = origem.split('\n')
    destino = open(destino, 'a')
    destino.write('numero de palavras: {}\n'.format(len(lista_de_palavras)))
    destino.write('numero de linhas: {}\n'.format(len(lista_de_linhas)))
    destino.write('numero de vogais: {}\n'.format(vogais_num))
    destino.write('numero de consoantes: {}\n'.format(consoantes_num))
    destino.write('numero de numerais: {}\n'.format(numerais_num))
    destino.write('numero de demais: {}\n'.format(demais_num))
    destino.write('numero de letras: {}\n'.format(len(origem)))
    
  def ex4(texto1, texto2):  
    f1 = codecs.open(texto1, "r", encoding = 'utf-8')
    f2 = codecs.open(texto2, "r", encoding = 'latin1')

    palavras1 = []
    palavras2 = []
    for i in f1:
        for j in re.split(r"[\n\s\W]+", i):
            if j != '':
                palavras1.append(j)
    for i in f2:
        for j in re.split(r"[\n\s\W]+", i):
            if j != '':
                palavras2.append(j)
    if len(palavras1) > len(palavras2): 
      max, min = palavras1, palavras2
    else: max,min = palavras2, palavras1

    class flag(Exception): pass
    try:
        for i in range(len(max)-4):
            for j in range(len(min)-4):
                print(max[i:i+5],min[j:j+5])
                if max[i:i+5] == min[j:j+5]:
                    raise flag
    except flag:
        print(True)
    f1.close()
    f2.close()