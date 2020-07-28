package javaKompendium_rozdzial9_2;

//Implementacja IntStack używająca tablicy o stałym rozmiarze.
class FixedStack implements IntStack {
private int stck[];
private int tos;

// alokacja i inicjalizacja stosu
FixedStack(int size) {
 stck = new int[size];
 tos = -1;
}

// umieszczenie elementu na szczycie stosu
public void push(int item) {
 if(tos==stck.length-1) // użycie zmiennej składowej length
   System.out.println("Stos jest pełny.");
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

class IFTest {
public static void main(String args[]) {
 FixedStack mystack1 = new FixedStack(5);
 FixedStack mystack2 = new FixedStack(8);

 // umieszczenie pewnych liczb na stosach
 for(int i=0; i<5; i++) mystack1.push(i);
 for(int i=0; i<8; i++) mystack2.push(i);

 // zdjęcie liczb ze stosów
 System.out.println("Stos w mystack1:");
 for(int i=0; i<5; i++)
    System.out.println(mystack1.pop());

 System.out.println("Stos w mystack2:");
 for(int i=0; i<8; i++)
    System.out.println(mystack2.pop());
}
}
