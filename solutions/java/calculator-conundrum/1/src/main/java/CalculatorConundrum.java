class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        if (operation == ""){
            throw new IllegalArgumentException("Operation cannot be empty");
        }else if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        } else if(operation != "+" && operation != "*" && operation != "/"){
            throw new IllegalOperationException ("Operation '"+operation+"' does not exist", null);
        }
        int resultado = 0;
        if(operation == "+"){
            resultado = operand1 + operand2;
            return operand1 + " + " + operand2 + " = " + resultado;
        }
        if(operation == "*"){
            resultado = operand1 * operand2;
            return operand1 + " * " + operand2 + " = " + resultado;
        }
        if(operation == "/"){try{
            resultado = operand1 / operand2;
            return operand1 + " / " + operand2 + " = " + resultado;
        }catch (ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed", e);
        }   
    }
    return "";    
}
}

