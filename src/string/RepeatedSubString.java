package string;

import java.util.*;

/**
 * @author huangyaping
 * @date 2018/9/12
 */
public class RepeatedSubString {
    public static void main(String[] args) {
        final RepeatedSubString ss = new RepeatedSubString();
        ss.lrsSuffixArray("abcdabcbb");
    }

    public RepeatedSubString() {
        String str = "https://daniel-hug.github.io/longest-repeated-substring/";
        str = "AphOlRpgxzonqGuCkQEmektxDTPNYLMqYDQHdpHEvJbWNUSDYNeQkuJXzoQYpyJgxFubStnJaTNobSNUJYoDWAvbakGpcbDoGySuUnfChUIcUTGdRMaHDlCqZBGuetEVrCCYomZyjHYKJRPggFUWEVlSHpzpdsdzAzFnJLQxhQWDpRYmGOlmqjRnUdITdnpDuJCYbuiWHAbcHUCdsJQoYfKILvrlXEBKNeBnJxqTHzhLRrjFlOBvGseEcikcWddVEmzrOEOabjvlZYYuTnAfQmnvbmsxHsnDHhiXULDAjsFDObheKdBtvirPFWUikKecfcrDHqTyZTSlHtseRQovmefXeWNCBtopOJNoPkLGFBmwLYvzNHRDEXErWxgdeLCMexOBgkFdnhyImnvcwXXxNecuhPhgJDqvbIXPfOiNoBRwpJPwDWzFLLucrDxakRzaEITLeZcrmHxxRttdfzprDYAeOvdwTijTKwuEJmyCqpVgYRXvOaCVtQpFkfxwYzbQfkfZwqLfMqieNnUYyYbuYTLfwIUjzxjzVjHYTRZSPawamyTOzatqMaPFEzRrvTyOmVwNDBDDzFwjyKqOwLwNpVhtooeOJeNtoWMleeOBjzXsEqhvwIiXYloWFQxyrhxgSboRhPNxceFCXpxqKpDTVlmxsBefqqPctLHfpeuIMjwCmfKhSnBSseHWSeKOrnXUcLQEbUYAoJSysOBnhGGgMlILLQTntjYyMbBHKZcceGHtWPXOSilsQQEadYbQqiyHmpFwFDfLzBvnXusFidNzIAniWvUgrdfoEluhGUlmuGCZEjLrZZIhvRIcjAiCjQNpDPCJImwagdWLyLmOCIJGonlkNRbancrpiSFZtVoYPNsIteQjPTanCXWjTHYvbxVVCIHTyJqVkVgiFtrqsHNozihFYwhcBMQjnYZybpaBGnMvRElUaBrsuiELSEmMTPmssjUfmhqfOhLVetlwaTKuVMwAogevFScVdqInvRLkRgfNrwdmaASdiwKgmAWctjyvDzuWwLXQIuCvgLTxRKUREuzAwciqwlxaLRYVVbxjLpkamHDXjobbScElYdXofXAmGsqdGBNIjTomMciauNULkVJvLjyIcvJxDlLQDcdKYfxRBWNzNvPikuprNBhURsOAWMduhumERgSjbUIaRAoSnkLnrdhUjQmLnBLOrYdGJFSwgLjrSdnhQjKEpYDmxlsjsolRdZEvzTdIzAhVlUliUjBQfIOtVWNJdeXxCevFbUraoKxpYhTVKnuVbYYSyUHVtjRmLeqepLVKTleyJUdxvPqatxhkhBhXcQDIkArVFjfEhiMmEKiTnyIUqGGjApEYrAHxnhKQZHdLxHXKkBZKcpDYCRDXNSJaZkVmjktFAbBuPJINDfKEReOeUIzvhieQBxaOMoairewdwaPbaOyWXVyTSukmJkvkvwQNPNpLzhZPWBwWMfnsyMjQnbUWCLIfjjiaGmCaRVLKzNsIybWbEXpCBnebcXIGMTHjgEUBryKOjDjYxfdHJNhpNcJrJlYgPrtICHTHlCvSEPrnjSvCIfnPuTiKEOTYEqIhTVpJJQIktGcBiKMADVoPEoCkHsBSaxCLFEHGLgVMXqsVtkqeBEEamvKXjOzZpVqlqgSMNknQWCWsnBishdCamTVWrdgEaWJoZOwIVNXUGBbRnBIwTzHIbzPMVXfyQBaJsaQMNerjTYSQElgrpMMFFwmZVaAWnhOyVXNRTamxXmEeYsBxOSwYtjskRtQgGotMWvVHxxwejntHwRNSrIQPJehcmfvghimOspulsywnJIxwmniMMUGfrJaAquRexHeYXdIVYQkFkDprYXyUmuMdRRysqfvmoepLuFCBTULJrNbiTpQPywhZjBWXabUrmSVnxuTMcClDiLrRJuYqxFNkHKIlWerKVQDDJCpCZYrgsEqdqbOZLzKajgDGylaEilzYGluvtlqJlcDrqIyDBJTIIOhponzaBfdoneklfvcjAeBSGxknmDixnKUcWylThxCsGoaoIFDjHVIxuEsJFVTTrRAitHeooGACPGZErpyZoIQubCIsWvbAyKmLZTaeNaNsMcFQwoJGpKbNqrkhRgYDmBsRXHKAjYqWkAYDuyoXwfWuuIBGBlsMrBlsrnaDOrwOGlzZYpLNnkrwQfzRZFHgcrVAPsAciOaKjSYYNbpQcTZQZDrURAPWhmJvXCHYoymVqZjWyaczXEybDBpuYZxcSAEsVvGYndyqjjMeAxHHTreMFBLpXBXVImRmwQrMValFzLKfMKSSfmqvHELfajLiCkFMLpiEGLggyYjsKnzwdEXmaKheqEGxwtjXQvHNGwqwYJBPLWPKGKFRjqmLEerkRDTRaDrBAbzEjWQFWGXoFBwIBqhDucCwDYfSCATheHNuhwtCttkywjZqIriHvAbGdwhdxmhErrZrrVhWCClirQNDdnotEVCRfgmkgMmQRMFHgGgDDrteyzNrYJzsFczWRSyaSKrvAoGufCXFspulqJhiHWzeJubJcUkqPsqJIkLUzLPEBaMMyoqqhXALEFGuOJjCfIKiGbqKFpJythMzWJLcljbZVSzvPwJldUfEKsnwxmdFcofMxtGJpDuwvtshWYVYvzfMcpFQXZlljOqxQXOkPwaHwHdGIUgzRjqJkmzrEPmAujlWJXiPzYwyeKHahrBJAucQeCaRsekpcPdMMkRTMMKQWUgscSucvpgxJByOqJkqpHoXtoliAWqUMAqFUwHreJZZygbmQPBhKEERCeefuUkyUIfHtjXQCcAicAzWwDTDmWOEFuHgqvTUkdWFTKzcqxKkIMkbhldrgtgxlvtNsnIMjjXvigLQHCGYgkmuLEufDqvmErVCLWXyqooEzDtxtKCurZKKzGVSNFzeBAsdvyFxoWYinJkxznlAYNlRwcYZqXswIdmFHYkQKapDTTdRAnOmocLPuwZQQQbePtwVYCbuSOCntzrPTvpXWvCiGDMhTpokbRSINbYOQIRnvZuvaNazpZEgSBoMjCErUzHYdsNwzqxijhfKMhWLGVrpzTznNuFKczKSPTUnJIGsbAGSHYeDYzlAJQLVoUzSRWBoypFoJTDnCCvNCCNmjboOPCMhoimOvtsGPOUPwYPcJArRQwTcJkDyseQVWZMZeYBlMPRQQbfYDWRLifrRnlDnaGAnJlxzaczJFstMoCHTbAvwlXECPcKkYOYqBiuxWkcXtLWIoFJtAAqMXnAWNVqdmxIjtlCSJCLDaHFkTbHnJjEkKwAvSqzVhpCMgCzOiDaDdWkWpbyAMQWjFOEYtcpqqeMCMgGDUHJtlIDhsfwmflkqNJQqpnwmcRBhkDiNRZgdQvxqAyYWCuEwFuqosEyuINZsLLfLZWLHJZPrPqfQTPzzjBquZEwXelaRVyypiPCKvaTDwHHsfpfFUZfqTzxDPEqVevxWVlaUpirblAzUCnXesbgBQvLIGHkMttjbTwBUPUxJdWdfoIvJXnncFqVskysRdZKHcSTyUtMEsswyAbaqNSVRXNahvFzeCLGKIEgHzfPezWVXPGoBiirDLgJbYWlUvNWGNlrMCzBwyhOecTISeNiPsIXDrRdRfAnERRbKfqbcTkozUUUiKHiDSgIekjiuMuCeFIqCoUVEgBaEofEtzDPSubPGQfiAKzZXQWkwuHrgXysQnYTKhuppnZoBzmuTBCwJqBPgxrkwclVLoLGLJDjmJpeHADeOCknqAZsYgKqRZqbMpLiyjdkTNxLbcqEcDbTKpqFuAlkJPmIdRbBBolKRveoiSmLYDuAZJmWxtiLUcRtchhHCTgvyveQdexSCLejdrTfmtReNKQoDtfffBnZFcURFoVegttBFjUbwhZfvRKWUgHcCYIuEKDGwstrdTzOJSKALOqgKYsvesDPbPuEjTOtrWYZGIfFAIiUgwOtpSyrhVtNdxuSqDsSnIjRJxeUwwvabmXCVqOttOphEvQQutkZQrLLjxcFuvZWPOGJivliWGkEWvIMnWmSNGTjSqGhsfDZzQKBggeVdzJWiJSZFVuOVSntmtQSKqHwiCbuUOrPCBDTllpRdthSUwZHRglxvSdovxPAxIrtddfNHfsJWMKRgjiiDkeJUQioYnSqBHDFirtNLcDEjCQRrzlXMgXGUpvHsNKcLrdRenpSmcHGBnWFmLQOfhjaFOqqwrRNDkOCOVkaeWCrtUdfSphVhrvlnQwcKWtKhpfJMvwsueTBODNAFWUNBePNpjsxsOKdSwKvMKzwaxbsQVJMriWmvLDExStJpJDNplPPMAEyOtqVnEMPoUZJgNZNcUSqTCQCQpzYmXrBnLcwvZOsSYrVMLVMjonqMTDUcWjYaRTNjnfEGZOAXephKNfjwziszVjgPWNBIdLtDtdbhAaglbgXOSeffYMpwJUEblExXdBBCNURIBXwWxMkQtLoDqDduSkBTXZPuClAxzhqUJitBPYinpVLSwHzAjffViQCLkhfPUoLdhKLGAZFhygfrQFBGhJRJZIJFzfoWpAVQScOlClsHLQLzOotxoUwAeZdQMtCdyLbWgXIgHluofTmgawBqOWpdNvqdUFYjfAyjcyOFRkJPmkzmYBLEegjVLLsGCLjBCQXfaJseBIfeZpNEtfdngTgceDSqXjLMLZPxuVVlQBwuXXlaiupjhIoXUPgnOALjyTBgRICDonGgMcgGtsyrUtHGHvWKhjdTGcOPwBngkHeXueMCjPLBYRmKYUnKvFlElcyLBHzsOSZPiXNqXVNNwiwNbyVeejXQVpKTaxcFrWZXknaCHLOwxtoPyXJbKMqDKzKCQMlHwDXkOnOdPsxYUebCvbSFKvMnOVWxbcucdJJvDyXtmaIkvToSPDcFMMPpMMmaImliqPCSIQYuLJiYESQEPGbezVUisWwiGJtvtNPPrIwaJVPRwsaBWwzsUwobxQFHyltlgKluqZLAkmnJHUAkbwVFFzTEDHqetNNKGqMaKVFLzxYXMMxzLzIqhMjEdtLlNjgULLqM";
//        str = "AphOlRpgxzonqGuCkQEmektxDTPNYLMqYDQHdpHEvJbWNUSDYNeQkuJXzoQYpyJgxFubStnJaTNobSNUJYoDWAvbakGpcbDoGySuUnfChUIcUTGdRMaHDlCqZBGuetEVrCCYomZyjHYKJRPggFUWEVlSHpzpdsdzAzFnJLQxhQWDfdAphOlRpgxzonqGuCkQEmektxDTPNYLMqYDQHdpHEvJbWNUSDYNeQkuJXzoQYpyJgxFubStnJaTNobSNUJYoDWAvbakGpcbDoGySuUnfChUIcUTGdRMaHDlCqZBGuetEVrCCYomZyjHYKJRPggFUWEVlSHpzpdsdzAzFnJLQxhQWD";
//        str = "5ehOlRpgxzonqGuCkQEmeabcdf09fdhOlRpgxzonqGuCkQEmeabcdfdef34";
        //str = RandomStringUtils.randomAlphabetic(100 * 100);
        final long start = System.currentTimeMillis();
        lrsSuffixArray(str);
        System.out.println(System.currentTimeMillis() - start);
        lrsSuffixArray("abcdabcbb");
        lrsSuffixArray("bbbbb");
        lrsSuffixArray("abcbabcb");
    }

    void lrsSuffixArray(String str) {
        List<String> sa = new ArrayList<>();
        for (int i = str.length()-1; i >= 0; i--) {
            String ss = str.substring(i, str.length());
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < ss.length(); j++) {
                if (set.contains(ss.charAt(j))) {
                    ss = ss.substring(0, j);
                } else {
                    set.add(ss.charAt(j));
                }
            }
            sa.add(ss);
        }
        Collections.sort(sa);
        //System.out.println(sa);
        int maxLen = 0;
        String maxSub = "";
        for (int i = 0; i < sa.size()-1; i++) {
            String a1 = sa.get(i);
            String a2 = sa.get(i+1);
            int len = Math.min(a1.length(), a2.length());
            int idx = 0;
            while (idx < len && a1.charAt(idx) == a2.charAt(idx)) {
                idx++;
            }
            if (idx > maxLen) {
                maxLen = idx;
                maxSub = a1.substring(0, idx);
            }
        }
        System.out.println(maxLen+", "+maxSub);
    }
    /**
     * 搜索字符串的最长重复子串。
     * 子串不能包含重复字符。
     * 例如：
     * Input:abcdabcbb
     * Output:abcd
     * Input:bbbbb
     * Output:b
     * Input:abc
     * Output:(空串)
     *
     * @param str 字符串
     * @return 最长重复子串
     */
    public String lrs(String str) {
        final char[] chars = str.toCharArray();
        final int length = chars.length;
        int maxLenIdx = 0;
        int maxLen = 0;
        // si=头指针，ei=尾指针
        for (int si = 0; si < length - 1 - maxLen; si++) {
            for (int ei = si + (length - si) / 2; ei > si; ei--) {
                if (ei - si < maxLen) {
                    // 优化：小于maxLen的不用再判断
                    break;
                }
                // 判断是否有重复字符
                /*if (ei - si > 1 && hasRepeatedChar(chars, si, ei)) {
                    continue;
                }*/
                final int indexOf = indexOf(chars, si, ei, ei);
                if (indexOf != -1) {
                    maxLenIdx = si;
                    maxLen = ei - si;
                    break;
                }
            }
        }
        // 打印最长重复子串，及其长度
        System.out.println(str.substring(maxLenIdx, maxLenIdx + maxLen) + ", " + maxLen);
        return str.substring(maxLenIdx, maxLenIdx + maxLen);
    }

    private final HashSet<Character> set = new HashSet<>();

    private boolean hasRepeatedChar(char[] chars, int si, int ei) {
        set.clear(); // 初始化set，重复利用空间
        while (si < ei) {
            if (set.contains(chars[si])) {
                return true;
            } else {
                set.add(chars[si]);
            }
            si++;
        }
        return false;
    }

    private int indexOf(char[] chars, int s, int e, int from) {
        int len = e - s;
        int ei = chars.length - len;
        for (int si = from; si <= ei; si++) {
            if (chars[si] != chars[s]) {
                continue;
            }
            int j = si + 1;
            int end = si + len;
            for (int k = 1; j < end && chars[j] == chars[s + k]; j++, k++) ;
            if (j == end) {
                return si;
            }
        }
        return -1;
    }

}
