package yourtech.demo.services.Operations;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExpenseOperationFactory {

    private final AddExpenseOperation addExpenseOperation;
    private final EditExpenseOperation editExpenseOperation;
    private final DeleteExpenseOperation deleteExpenseOperation;

    //@Autowired
    public ExpenseOperationFactory(AddExpenseOperation addExpenseOperation,
                                   EditExpenseOperation editExpenseOperation,
                                   DeleteExpenseOperation deleteExpenseOperation) {
        this.addExpenseOperation = addExpenseOperation;
        this.editExpenseOperation = editExpenseOperation;
        this.deleteExpenseOperation = deleteExpenseOperation;
    }

    public ExpenseOperations getExpenseOperation(ExpenseOperationType operationType) {
        switch (operationType) {
            case ADD:
                return addExpenseOperation;
            case EDIT:
                return editExpenseOperation;
            case DELETE:
                return deleteExpenseOperation;
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}
