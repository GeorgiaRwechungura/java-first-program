import java.util.Map;

public class Finance {
    public final String BEST_LOAN_RATES="bestLoanRates";
    public final String SAVINGS_CALCULATOR="savingsCalculator";
    public final String MORTGAGE_CALCULATOR="mortgageCalculator";
    public static final Map<String, String>
            map=Map.of( BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>"
            );

   private static boolean validateCommandArguments(String args){
       switch (args){
           case BEST_LOAN_RATES
               return args.length

       }
       return  false;

   }
}
