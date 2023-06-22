"""
1-Girdi parametresi olarak gelen bir tamsayının mutlak değerini geri döndüren Python fonksiyonunu, ne “if” deyimi 
ne de math kütüphanesinden herhangi bir fonksiyonu (“abs”, “sqrt”, vs.) kullanmadan yazın. 
Yazdığınız fonksiyonun negatif, pozitif ve 0 değerli girdi parametreleriyle doğru çalıştığından emin olun."""

def mutlak(x):
	return x*((x>0)-(x<0))
