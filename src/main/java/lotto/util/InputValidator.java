package lotto.util;

import lotto.constant.Amount;
import lotto.constant.ErrorMessage;
import lotto.util.MatcherUtil;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static lotto.constant.Amount.THOUSAND;
import static lotto.constant.Amount.ZERO;
import static lotto.constant.Condition.ONLY_NUMBERS;
import static lotto.constant.ErrorMessage.IS_NOT_DIVISIBLE_BY_THOUSAND;
import static lotto.constant.ErrorMessage.IS_NOT_NUMBER;

public class InputValidator {
    public void validateInputPurchaseAmount(String inputPurchaseAmount) {
        validateMatcherCondition(isNotNumber(inputPurchaseAmount));
        validateIsDivisibleByThousand(inputPurchaseAmount);
    }

    private boolean isNotNumber(String inputNumber) {
        Pattern pattern = MatcherUtil.providePattern(ONLY_NUMBERS.getValue());
        Matcher matcher = MatcherUtil.provideMatcher(pattern, inputNumber);
        return matcher.find();
    }

    private void validateIsDivisibleByThousand(String inputNumber) {
        if (Integer.parseInt(inputNumber) % THOUSAND.getValue() != ZERO.getValue()) {
            throw new IllegalArgumentException(IS_NOT_DIVISIBLE_BY_THOUSAND.getValue());
        }
    }

    private void validateMatcherCondition(boolean isNotNumber) {
        if (isNotNumber) {
            throw new IllegalArgumentException(IS_NOT_NUMBER.getValue());
        }
    }

    public void validateBonusNumber(String bonusNumber) {
        validateMatcherCondition(isNotNumber(bonusNumber));
    }


}