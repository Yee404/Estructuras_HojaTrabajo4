import java.util.Vector;

public interface ICalculator {
    
    public int add(int n1, int n2); //+
    public int substraction(int n1, int n2); //-
    public int multiplication(int n1, int n2); //*
    public int division(int n1, int n2) throws Exception; // /
    public int residue(int n1, int n2) throws Exception; // %
    public Vector<String> read(String charactersString) throws Exception;
    public int solve(Vector<String> elements) throws Exception;

}
