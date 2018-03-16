PROGRAM sample;

VAR
    i, j, odd : integer;
    alpha, beta5x : real;
    
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
END.
