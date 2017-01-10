package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;


/**
 * @author vuksa2103
 */
public class CloakCoinMain extends BitFamily {
    private CloakCoinMain() {
        id = "cloakcoin.main";

        addressHeader = 27;
        p2shHeader = 85;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 191;

        name = "CloakCoin (beta)";
        symbol = "CLOAK";
        uriScheme = "cloakcoin";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(10000); // 0.0001 SDC
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 SDC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("CloakCoin Signed Message:\n");
    }

    private static CloakCoinMain instance = new CloakCoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
