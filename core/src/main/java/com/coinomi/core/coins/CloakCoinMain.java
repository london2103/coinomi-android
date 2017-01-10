package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author dasource
 */
public class CloakCoinMain extends PeerFamily {
    private CloakCoinMain() {
        id = "shadowcash.main";

        addressHeader = 63;
        p2shHeader = 125;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;
        dumpedPrivateKeyHeader = 191;

        name = "ShadowCash (beta)";
        symbol = "SDC";
        uriScheme = "shadowcash";
        bip44Index = 35;
        unitExponent = 8;
        feeValue = value(10000); // 0.0001 SDC
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 SDC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("ShadowCash Signed Message:\n");
    }

    private static CloakCoinMain instance = new CloakCoinMain();
    public static synchronized CloakCoinMain get() {
        return instance;
    }
}
