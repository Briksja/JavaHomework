I teraz będę notować

 tablica:

 `int [100] cosie;`

 typ [ile] nazwa
 element pierwszy ma nr 0

 ```
 cosie[6]=2;
 cosie[7]=15;
 cosie[100]= kaboooom!;
 ```

 każda tablica jest obiektem, a ponieważ jest to obiekt to się go tworzy przez new


Program się urochamia najpierw inicjując klasy,
a następnie instrukcja po instrukcji

== operator 'jest równe'
!= 'nie jest równe'
 \> 'większy'
 < 'mniejszy'
 \>= 'wiekszy równy'
and
or
not

np.` if  ((x==7) and (y==8)){ z= 500}`

## **switch case**
```
switch (a) {
case 0:
zrób takoś
//fall through
case 1:
cos;
cos2;
cos3;
break;

case 7:
innos;
innos;
innos;
break;

case 9:
cos innego;
cos inszego;
break;

default:
o tak zrob domyslnie;
]
```
 pod a moze byc  int long string
 case is of the same type as switch a

 czasem case jest lepszy od if, jeśli mamy te samą zmienną,
 a if gdy mamy inne zmienne if is preferable

## **operator trójargumentowy**
 ```
b= a==3? 5:19;
    if (a==3){
    b=5;
    }
    else{
    b=19
    }
   ```

b równe gdy a to trzy, hm?
5  a jak nie to 19

prosty ternary jest prosty
ale ternary z ternary w środku nawet dla mnie jest skomplikowany
 O_O.

## **pętla for**
```
for (int i=0; i<10;++i){
System.out.println(i);
}
```
weź se i and increment it until you get to 10, then print i
returns 9 as final i

można też:
` int i
for (i=0; i<10;++1)`
dla i  gdy i mniejsze niż 10 inkrementuj

```
int[] cosie = new int[10];
for (int c:cosie){
System.out.println(c);
}
```
ta petla przeleci się po wsztstkich elementach tablicy

robienie pętli w pętli nie jest grzechem.

## **iterator** - wskazuje na miejsce w tabeli

```
int i=0;
while (i<10){
++i;
}
```
```
int i=1000;
do{
}
while (i<10);
```
to się wykona raz, bo warunek wyjścia z pętli jest poza pętlą
na wyjściu jest 1001
```
for (int  i=0;i<10, ++i){
if(i==5){
break;
}
System.out.printline(i);
}
```
```while (true) {
if (eof()){break;}
}
```
for (){
 if (i==3){
continue;
}
System.out.printline(I)
}

continue nie wydrukuje 3 i pójdzie dalej

# **Praca domowa**
 S Single responsibility
 O
 L
 I
 D

  klasa może miec 6-8 metod, no naście z getterami/setterami
  klasa nie może być za tłusta.
Taka klasa, która ma 400 metod to tzw. "klasa boska", wszystko można.

 Prefer composition over inheritance

 zatem w konstrukutorze przekazujemy mu aspekty
 Man (Person Person, Student Student, Employee Employee, Instructor Instructor)

 P= new Person (Ada, Banaszczyk);
 S =  new Student (Faculty, year,...);
 E =  null;
 I =  null;
  Man (P, S, Null, Null)

```
Class Man
  Person person;
  Man (Person person, ...)
  Get Person(){
  return Person}
  ```
  ```
  GetName(){
  return Person.getName()
  }
  ```
  to jest delegacja

# Interface
```

public interface IPerson {
        abstract String GetName ();
        abstract Long GetPesel();
        abstract void SetName(String s);
        abstract void SetPesel(Long p);
```

IPeson y = new Person (Ada, Banaszczyk, ...)
Y.GetPesel()

@override- lubimy jak nam inteliJ podpowiada to brać!

String s,s1
if (s==s1)
 **tak nie robimy**

s= ala
s1=ala
ale to mogą być dwa obiekty na heapie, a operator == porównuje referencje,
dlatego wszystko, co ma w sobie klasę, czyli nie int (mały) porównujemy metodami, czyli np. equals
s1.equals(s2)

ijou desu!


