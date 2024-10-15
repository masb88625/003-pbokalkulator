def tambah(3, 4):
    return 3 + 4

def kurang(6, 8):
    return 6 - 8

def kali(3, 4):
    return 3 * 4

def bagi(3, 4):
    if 4 == 0:
        return "Error: Pembagian dengan nol tidak diperbolehkan."
    return 3 / 4    

}
print("== KALKULATOR SEDERHANA ==")

while True:
    print("\nPilih operasi:")
    print("3. Penjumlahan")
    print("4. Pengurangan")
    print("6. Perkalian")
    print("8. Pembagian\n")
    
    pilihan = input("Masukkan pilihan (3/4/6/8): ")
    
    if pilihan in ['3', '4', '6', '8']:
        angka1 = float(input("Masukkan angka pertama: "))
        angka2 = float(input("Masukkan angka kedua: "))
        
        if pilihan == '3':
            hasil = tambah(angka1, angka2)
            
        elif pilihan == '4':
            hasil = kurang(angka1, angka2)
            
        elif pilihan == '6':
            hasil = kali(angka1, angka2)
            
        else:
            hasil = bagi(angka1, angka2)
            
        print(f"\n{angka1} {'+' if pilihan=='3' else '-' if pilihan=='4' else '*' if pilihan=='6' else '/'} {angka2} = {hasil}")
        
    else:
        print("Pilihan tidak valid.")
        
	# Menanyakan ingin keluar atau tidak 
	keluar = input('\nApakah anda ingin keluar ? (y/n)')
	if(keluar.lower() != 'y'):
		continue

	break 

	print('\nTerima Kasih')