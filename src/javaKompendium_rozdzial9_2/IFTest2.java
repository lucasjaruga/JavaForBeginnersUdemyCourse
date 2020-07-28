package javaKompendium_rozdzial9_2;

//Implementacja rozszerzającego się stosu.
class DynStack implements IntStack {
private int stck[];
private int tos;

// alokacja i inicjalizacja stosu
DynStack(int size) {
 stck = new int[size];
 tos = -1;
}

// umieszczenie elementu na szczycie stosu
public void push(int item) {
 // jeśli stos jest pełny, alokacja nowej tablicy o większym rozmiarze
 if(tos==stck.length-1) {
   int temp[] = new int[stck.length * 2]; // podwojenie rozmiaru
   for(int i=0; i<stck.length; i++) temp[i] = stck[i];
   stck = temp;
   stck[++tos] = item;
 }
 else
   stck[++tos] = item;
}

// zdjęcie elementu ze szczytu stosu
public int pop() {
 if(tos < 0) {
   System.out.println("Stos nie zawiera żadnych elementów.");
   return 0;
 }
 else
   return stck[tos--];
}
}

class IFTest2 {
public static void main(String args[]) {
 DynStack mystack1 = new DynStack(5);
 DynStack mystack2 = new DynStack(8);

 // pętle powodują zwiększenie rozmiaru stosu
 for(int i=0; i<12; i++) mystack1.push(i);
 for(int i=0; i<20; i++) mystack2.push(i);

 System.out.println("Stos w mystack1:");
 for(int i=0; i<12; i++)
    System.out.println(mystack1.pop());

 System.out.println("Stos w mystack2:");
 for(int i=0; i<20; i++)
    System.out.println(mystack2.pop());
}
}