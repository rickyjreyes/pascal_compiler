.class public sample
.super java/lang/Object

.field private static _runTimer LRunTimer;

; i,j,odd:integer

.field private static i I
.field private static j I
.field private static odd I

; alpha,beta5x:real

.field private static alpha F
.field private static beta5x F

; l,m,n:integer

.field private static l I
.field private static m I
.field private static n I

; a,b,c:integer

.field private static a I
.field private static b I
.field private static c I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

; FUNCTIONsquare(n:integer):integer;BEGINsquare:=n*n;END


.method static square(I)I

; square:=n*n

	iload_0
	iload_0
	imul
	ireturn

; 


.limit stack 5
.limit locals 5
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sample/_runTimer LRunTimer;

; i:=32

	ldc	32
	putstatic	sample/i I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "i = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/i I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; j:=i

	getstatic	sample/i I
	putstatic	sample/j I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "j = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/j I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; i:=-2+3*j

	ldc	2
	ineg
	ldc	3
	getstatic	sample/j I
	imul
	iadd
	putstatic	sample/i I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "i = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/i I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; alpha:=9.3

	ldc	9.3
	putstatic	sample/alpha F

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "alpha = %f\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/alpha F
invokestatic  java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; beta5x:=alpha

	getstatic	sample/alpha F
	putstatic	sample/beta5x F

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "beta5x = %f\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/beta5x F
invokestatic  java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; beta5x:=alpha/3.7-alpha*2.88

	getstatic	sample/alpha F
	ldc	3.7
	fdiv
	getstatic	sample/alpha F
	ldc	2.88
	fmul
	fsub
	putstatic	sample/beta5x F

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "beta5x = %f\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/beta5x F
invokestatic  java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; beta5x:=8.45*(alpha+9.12)

	ldc	8.45
	getstatic	sample/alpha F
	ldc	9.12
	fadd
	fmul
	putstatic	sample/beta5x F

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "beta5x = %f\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/beta5x F
invokestatic  java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; IFi>10THENj:=100

	getstatic	sample/i I
	ldc	10
	if_icmpgt L2
	iconst_0
	goto L3
L2:
	iconst_1
L3:
ifeq	L1

; j:=100

	ldc	100
	putstatic	sample/j I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "j = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/j I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

L1:

; IFi=jTHENj:=200ELSEj:=300

	getstatic	sample/i I
	getstatic	sample/j I
	if_icmpeq L5
	iconst_0
	goto L6
L5:
	iconst_1
L6:
ifeq	L7

; j:=200

	ldc	200
	putstatic	sample/j I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "j = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/j I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

goto L4
L7:

; j:=300

	ldc	300
	putstatic	sample/j I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "j = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/j I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

L4:

; i:=1

	ldc	1
	putstatic	sample/i I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "i = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/i I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; WHILEi<50DOBEGINi:=i+1;odd:=i*2+1;END

L8:
	getstatic	sample/i I
	ldc	50
	if_icmplt L10
	iconst_0
	goto L11
L10:
	iconst_1
L11:
ifeq	L9

; BEGINi:=i+1;odd:=i*2+1;END


; i:=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "i = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/i I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; odd:=i*2+1

	getstatic	sample/i I
	ldc	2
	imul
	ldc	1
	iadd
	putstatic	sample/odd I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "odd = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/odd I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; 

goto L8
L9:

; l:=0

	ldc	0
	putstatic	sample/l I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "l = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/l I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; FORm:=lTO5DOBEGINn:=m;END

	getstatic	sample/l I
	putstatic    sample/m I 
L12:
	getstatic    sample/m I 
	ldc	5
	if_icmpgt L14
	iconst_0
	goto L15
L14:
	iconst_1
L15:
	ifne L13

; BEGINn:=m;END


; n:=m

	getstatic	sample/m I
	putstatic	sample/n I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "n = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/n I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; 

	getstatic    sample/m I 
	iconst_1
	iadd
	putstatic    sample/m I 
	goto L12
L13:

; begina:=10;repeata:=a+1untila=20;end


; a:=10

	ldc	10
	putstatic	sample/a I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "a = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/a I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; repeata:=a+1untila=20

L16:

; a:=a+1

	getstatic	sample/a I
	ldc	1
	iadd
	putstatic	sample/a I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "a = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/a I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

	getstatic	sample/a I
	ldc	20
	if_icmpeq L18
	iconst_0
	goto L19
L18:
	iconst_1
L19:
ifeq    L16
goto L17
L17:

; 


; b:=3

	ldc	3
	putstatic	sample/b I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "b = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/b I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; case(b)of1:c:=50;2:c:=51;3:c:=52end

	getstatic	sample/b I
	lookupswitch
	1:    L20
	2:    L21
	3:    L22
	default: L99
L20:

; c:=50

	ldc	50
	putstatic	sample/c I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "c = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/c I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

	goto L99
L21:

; c:=51

	ldc	51
	putstatic	sample/c I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "c = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/c I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

	goto L99
L22:

; c:=52

	ldc	52
	putstatic	sample/c I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "c = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/c I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V

	goto L99
L99:

; b:=square(2)

	ldc	2
	invokestatic sample.square(I)I
	putstatic	sample/b I

; DEBUG: PRINT VALUE
getstatic    java/lang/System/out Ljava/io/PrintStream;
ldc          "b = %d\n"
iconst_1
anewarray    java/lang/Object
dup
iconst_0
getstatic     sample/b I
invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V


; 


	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
