PROGRAM sample;

VAR
    i, j, odd : integer;
    alpha, beta5x : real;
    l,m,n: integer;
    a, b, c: integer;

FUNCTION square(n: integer): integer;   
BEGIN
	square := n*n;
END;

BEGIN
    i := 32;
    j := i;
    i := -2 + 3*j;

    alpha := 9.3;
    beta5x := alpha;
    beta5x := alpha/3.7 - alpha*2.88;
    beta5x := 8.45*(alpha + 9.12);
		
	IF i > 10 THEN j := 100;
	IF i = j THEN j := 200 ELSE j := 300;
	
	i := 1;
    WHILE i < 50 DO BEGIN
		i := i + 1;
        odd := i*2 + 1;
    END;
    l:=0;

    FOR m := l TO 5 DO BEGIN
        n := m;
    END;

    begin
       a := 10;
       repeat
          a := a + 1
       until a = 20;
    end;

   b := 3;

   case (b) of
      1 : c:=50;
      2 : c:=51;
      3 : c:=52
      end;

   b := square(2);

END.
