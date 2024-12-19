
from math import *
import sys
import ast

def somme(a,b):
	return a+b

def soustraction(a,b):
	return a-b

def mult(a,b):
	return a*b

def division(a,b):
	return a/b

def main():
	# Import data
	args = sys.argv[1:]
	arrays = {}
	
	for i in range(0,len(args),2):
		if (i+1) < len(args):
			cle = args[i]
			valeur = ast.literal_eval(args[i+1])
			arrays[cle] = valeur
	
	# Longueur des colonnes
	n = len(valeur)
	#print(arrays)
	# Calcul
	res = [mult(x,y) for x,y in zip([3.0]*n, arrays["a"])]

	with open("data.txt", "w") as file:
		file.write(str(res))
	#print(res)

if __name__ == "__main__":
	main()


