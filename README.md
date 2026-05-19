# Pascal Compiler

A small Pascal-to-JVM compiler for compiling `JcPascal` source files into Jasmin assembly, then into Java `.class` files.

## Requirements

Make sure the following files are in the project folder or available on your classpath:

- `antlr-4.7-complete.jar`
- `jasmin.jar`
- `RunTimer.java`
- `sample.pas`

You also need Java installed.

## Build / Run

### 1. Compile `RunTimer.java`

```bash
javac RunTimer.java
```

### 2. Run the JcPascal compiler

Run the compiler with `sample.pas` as the input argument.

Make sure `antlr-4.7-complete.jar` is included as an external library or on the classpath.

Windows:

```bash
java -cp ".;antlr-4.7-complete.jar" JcPascal sample.pas
```

macOS/Linux:

```bash
java -cp ".:antlr-4.7-complete.jar" JcPascal sample.pas
```

After this runs successfully, it will generate:

```text
sample.j
```

### 3. Generate the Java class file with Jasmin

```bash
java -jar jasmin.jar sample.j
```

This generates:

```text
sample.class
```

### 4. Run the compiled Pascal program

```bash
java sample
```

## Notes

`sample.class` requires `RunTimer.class` to be in the same folder.

If `RunTimer.class` does not exist yet, compile it first:

```bash
javac RunTimer.java
```

## Windows Batch Example

You can also create a `run.bat` file:

```bat
javac RunTimer.java

java -cp ".;antlr-4.7-complete.jar" JcPascal sample.pas

java -jar jasmin.jar sample.j

java sample

pause
```

## Expected Output Flow

```text
sample.pas
   ↓
JcPascal compiler
   ↓
sample.j
   ↓
Jasmin assembler
   ↓
sample.class
   ↓
Java runtime
```
