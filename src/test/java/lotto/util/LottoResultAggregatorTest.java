package lotto.util;

import lotto.BonusNumber;
import lotto.Lotto;
import lotto.LottoDrawResult;
import lotto.LottoPurchaseDetails;
import lotto.constant.LottoGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LottoResultAggregatorTest {

    private static final LottoResultAggregator lottoResultAggregator = new LottoResultAggregator();
    private static final List<List<Integer>> lottoTickets = new ArrayList<>();
    private static final int PURCHASE_AMOUNT = 2000;
    private static final int MATCHED_ONE_TIME = 1;

    @Test
    void 로또_당첨_결과_통계_테스트() {

        List<Integer> firstLottoTicket = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> secondLottoTicket = Arrays.asList(10, 11, 12, 13, 14, 15);

        Lotto WinningNumbers = new Lotto(Arrays.asList(10, 11, 12, 13, 20, 21));

        lottoTickets.add(firstLottoTicket);
        lottoTickets.add(secondLottoTicket);

        LottoPurchaseDetails lottoPurchaseDetails = new LottoPurchaseDetails();

        lottoPurchaseDetails.assignIssuedLottoTickets(lottoTickets);
        lottoPurchaseDetails.assignPurchaseAmount(PURCHASE_AMOUNT);

        BonusNumber bonusNumber = new BonusNumber(7, WinningNumbers.getNumbers());

        LottoDrawResult lottoDrawResult = new LottoDrawResult();

        lottoDrawResult.assignWinningNumber(WinningNumbers);
        lottoDrawResult.assignBonusNumber(bonusNumber);

        Map<LottoGrade, Integer> aggregatedLottoResults = lottoResultAggregator.aggregateLottoResults(lottoDrawResult, lottoPurchaseDetails, PURCHASE_AMOUNT);

        Assertions.assertEquals(MATCHED_ONE_TIME, aggregatedLottoResults.get(LottoGrade.FOUR_MATCHED));


    }
}
