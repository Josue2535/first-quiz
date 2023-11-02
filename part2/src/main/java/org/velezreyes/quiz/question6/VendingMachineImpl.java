package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

    private int quarters;
    
    public static VendingMachine getInstance() {
        return new VendingMachineImpl();
    }
    

    @Override
    public void insertQuarter() {
        quarters++;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        
        if ("ScottCola".equals(name)) {
            if (quarters >= 3) {
                quarters -= 3;
                return new DrinkImpl("ScottCola", true);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else if ("KarenTea".equals(name)) {
            if (quarters >= 4) {
                quarters -= 4;
                return new DrinkImpl("KarenTea", false);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownDrinkException();
        }
    }
}
