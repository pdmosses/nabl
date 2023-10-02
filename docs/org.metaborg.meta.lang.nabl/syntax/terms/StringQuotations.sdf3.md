---
title: StringQuotations.sdf3
hide:
  - toc
---

# `StringQuotations.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/StringQuotations.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/StringQuotations.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/terms/StringQuotations.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="terms/StringQuotations_7_29" title="Not referenced locally, nor via imports">terms/StringQuotations</span>

<span class="keyword">imports</span> 

  <a href="../Terms.sdf3#terms/Terms_7_18" id="terms/Terms_43_54" title="Defined at ../Terms.sdf3 line 1">terms/Terms</a>

<span class="keyword">sorts</span>

  <span id="PPTerm_65_71" title="Not referenced locally, nor via imports">PPTerm</span>
  <a href="#StringQuotation_373_388" id="StringQuotation_74_89" title="Referenced at line 19">StringQuotation</a>
  <a href="#StringQuotedPart1_445_462" id="StringQuotedPart1_92_109" title="Referenced at line 21">StringQuotedPart1</a> <a href="#StringQuotedChars1_2442_2460" id="StringQuotedChars1_110_128" title="Referenced at line 63">StringQuotedChars1</a> <a href="#QuotedBracket1_701_715" id="QuotedBracket1_129_143" title="Referenced at line 25">QuotedBracket1</a> <a href="#Dollar1_2582_2589" id="Dollar1_144_151" title="Referenced at line 67">Dollar1</a>
  <a href="#StringQuotedPart2_913_930" id="StringQuotedPart2_154_171" title="Referenced at line 30">StringQuotedPart2</a> <a href="#StringQuotedChars2_2477_2495" id="StringQuotedChars2_172_190" title="Referenced at line 64">StringQuotedChars2</a> <a href="#QuotedBracket2_1170_1184" id="QuotedBracket2_191_205" title="Referenced at line 34">QuotedBracket2</a> <a href="#Dollar2_2608_2615" id="Dollar2_206_213" title="Referenced at line 68">Dollar2</a>
  <a href="#StringQuotedPart3_1380_1397" id="StringQuotedPart3_216_233" title="Referenced at line 39">StringQuotedPart3</a> <a href="#StringQuotedChars3_2512_2530" id="StringQuotedChars3_234_252" title="Referenced at line 65">StringQuotedChars3</a> <a href="#QuotedBracket3_1636_1650" id="QuotedBracket3_253_267" title="Referenced at line 43">QuotedBracket3</a> <a href="#Dollar3_2634_2641" id="Dollar3_268_275" title="Referenced at line 69">Dollar3</a>
  <a href="#StringQuotedPart4_1846_1863" id="StringQuotedPart4_278_295" title="Referenced at line 48">StringQuotedPart4</a> <a href="#StringQuotedChars4_2547_2565" id="StringQuotedChars4_296_314" title="Referenced at line 66">StringQuotedChars4</a> <a href="#QuotedBracket4_2103_2117" id="QuotedBracket4_315_329" title="Referenced at line 52">QuotedBracket4</a> <a href="#Dollar4_2660_2667" id="Dollar4_330_337" title="Referenced at line 70">Dollar4</a>
  <a href="#Padding_2370_2377" id="Padding_340_347" title="Referenced at line 58">Padding</a>

<span class="keyword">syntax</span>
  
  <span id="PPTerm_361_367" title="Not referenced locally, nor via imports">PPTerm</span><span class="keyword">-CF</span> = <a href="#StringQuotation_74_89" id="StringQuotation_373_388" title="Defined at line 10, 21, 30, 39, 48">StringQuotation</a>
  
  <a href="#StringQuotation_373_388" id="StringQuotation_394_409" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation1_410_426" title="Not referenced locally, nor via imports">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#Padding_340_347" id="Padding_437_444" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart1_92_109" id="StringQuotedPart1_445_462" title="Defined at line 11, 22, 23, 24, 25">StringQuotedPart1</a>* <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart1_445_462" id="StringQuotedPart1_470_487" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="StringEscape1_488_501" title="Not referenced locally, nor via imports">StringEscape1</span></span>  = <a href="#Padding_340_347" id="Padding_505_512" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3#Term_523_527" id="Term_528_532" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart1_445_462" id="StringQuotedPart1_553_570" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr_571_575" title="Not referenced locally, nor via imports">QStr</span></span>           = <a href="#StringQuotedChars1_110_128" id="StringQuotedChars1_588_606" title="Defined at line 11, 26">StringQuotedChars1</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart1_445_462" id="StringQuotedPart1_613_630" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar_631_638" title="Not referenced locally, nor via imports">QDollar</span></span>        = <a href="#Dollar1_144_151" id="Dollar1_648_655" title="Defined at line 11, 28">Dollar1</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart1_445_462" id="StringQuotedPart1_662_679" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr_680_683" title="Not referenced locally, nor via imports">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket1_129_143" id="QuotedBracket1_701_715" title="Defined at line 11, 27">QuotedBracket1</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars1_2442_2460" id="StringQuotedChars1_726_744" title="Referenced at line 63">StringQuotedChars1</a><span class="keyword">-LEX</span>           = ~[\[\]\$]+
  <a href="#QuotedBracket1_701_715" id="QuotedBracket1_774_788" title="Referenced at line 25">QuotedBracket1</a><span class="keyword">-LEX</span>               = [\[\]]
  <a href="#Dollar1_2582_2589" id="Dollar1_818_825" title="Referenced at line 67">Dollar1</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>
  
  <a href="#StringQuotation_373_388" id="StringQuotation_862_877" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation2_878_894" title="Not referenced locally, nor via imports">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#Padding_340_347" id="Padding_905_912" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart2_154_171" id="StringQuotedPart2_913_930" title="Defined at line 12, 31, 32, 33, 34">StringQuotedPart2</a>* <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart2_913_930" id="StringQuotedPart2_938_955" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="StringEscape2_956_969" title="Not referenced locally, nor via imports">StringEscape2</span></span>  =  <a href="#Padding_340_347" id="Padding_974_981" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3#Term_523_527" id="Term_997_1001" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart2_913_930" id="StringQuotedPart2_1022_1039" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr_1040_1044" title="Not referenced locally, nor via imports">QStr</span></span>           = <a href="#StringQuotedChars2_172_190" id="StringQuotedChars2_1057_1075" title="Defined at line 12, 35">StringQuotedChars2</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart2_913_930" id="StringQuotedPart2_1082_1099" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar_1100_1107" title="Not referenced locally, nor via imports">QDollar</span></span>        = <a href="#Dollar2_206_213" id="Dollar2_1117_1124" title="Defined at line 12, 37">Dollar2</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart2_913_930" id="StringQuotedPart2_1131_1148" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr_1149_1152" title="Not referenced locally, nor via imports">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket2_191_205" id="QuotedBracket2_1170_1184" title="Defined at line 12, 36">QuotedBracket2</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars2_2477_2495" id="StringQuotedChars2_1195_1213" title="Referenced at line 64">StringQuotedChars2</a><span class="keyword">-LEX</span>           = ~[\{\}\$]+
  <a href="#QuotedBracket2_1170_1184" id="QuotedBracket2_1243_1257" title="Referenced at line 34">QuotedBracket2</a><span class="keyword">-LEX</span>               = [\{\}]
  <a href="#Dollar2_2608_2615" id="Dollar2_1287_1294" title="Referenced at line 68">Dollar2</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>

  <a href="#StringQuotation_373_388" id="StringQuotation_1329_1344" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation3_1345_1361" title="Not referenced locally, nor via imports">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#Padding_340_347" id="Padding_1372_1379" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart3_216_233" id="StringQuotedPart3_1380_1397" title="Defined at line 13, 40, 41, 42, 43">StringQuotedPart3</a>* <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart3_1380_1397" id="StringQuotedPart3_1405_1422" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="StringEscape3_1423_1436" title="Not referenced locally, nor via imports">StringEscape3</span></span>  = <a href="#Padding_340_347" id="Padding_1440_1447" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3#Term_523_527" id="Term_1463_1467" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart3_1380_1397" id="StringQuotedPart3_1488_1505" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr_1506_1510" title="Not referenced locally, nor via imports">QStr</span></span>           = <a href="#StringQuotedChars3_234_252" id="StringQuotedChars3_1523_1541" title="Defined at line 13, 44">StringQuotedChars3</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart3_1380_1397" id="StringQuotedPart3_1548_1565" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar_1566_1573" title="Not referenced locally, nor via imports">QDollar</span></span>        = <a href="#Dollar3_268_275" id="Dollar3_1583_1590" title="Defined at line 13, 46">Dollar3</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart3_1380_1397" id="StringQuotedPart3_1597_1614" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr_1615_1618" title="Not referenced locally, nor via imports">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket3_253_267" id="QuotedBracket3_1636_1650" title="Defined at line 13, 45">QuotedBracket3</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars3_2512_2530" id="StringQuotedChars3_1661_1679" title="Referenced at line 65">StringQuotedChars3</a><span class="keyword">-LEX</span>           = ~[\(\)\$]+
  <a href="#QuotedBracket3_1636_1650" id="QuotedBracket3_1709_1723" title="Referenced at line 43">QuotedBracket3</a><span class="keyword">-LEX</span>               = [\(\)]
  <a href="#Dollar3_2634_2641" id="Dollar3_1753_1760" title="Referenced at line 69">Dollar3</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>

  <a href="#StringQuotation_373_388" id="StringQuotation_1795_1810" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation4_1811_1827" title="Not referenced locally, nor via imports">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#Padding_340_347" id="Padding_1838_1845" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart4_278_295" id="StringQuotedPart4_1846_1863" title="Defined at line 14, 49, 50, 51, 52">StringQuotedPart4</a>* <span class="cons_Lit">"&gt;"</span>
  <a href="#StringQuotedPart4_1846_1863" id="StringQuotedPart4_1871_1888" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="StringEscape4_1889_1902" title="Not referenced locally, nor via imports">StringEscape4</span></span>  = <a href="#Padding_340_347" id="Padding_1906_1913" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"&lt;"</span>  <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3#Term_523_527" id="Term_1930_1934" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>
  <a href="#StringQuotedPart4_1846_1863" id="StringQuotedPart4_1955_1972" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr_1973_1977" title="Not referenced locally, nor via imports">QStr</span></span>           = <a href="#StringQuotedChars4_296_314" id="StringQuotedChars4_1990_2008" title="Defined at line 14, 53">StringQuotedChars4</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart4_1846_1863" id="StringQuotedPart4_2015_2032" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar_2033_2040" title="Not referenced locally, nor via imports">QDollar</span></span>        = <a href="#Dollar4_330_337" id="Dollar4_2050_2057" title="Defined at line 14, 55">Dollar4</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart4_1846_1863" id="StringQuotedPart4_2064_2081" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr_2082_2085" title="Not referenced locally, nor via imports">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket4_315_329" id="QuotedBracket4_2103_2117" title="Defined at line 14, 54">QuotedBracket4</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars4_2547_2565" id="StringQuotedChars4_2128_2146" title="Referenced at line 66">StringQuotedChars4</a><span class="keyword">-LEX</span>           = ~[\&lt;\&gt;\$]+
  <a href="#QuotedBracket4_2103_2117" id="QuotedBracket4_2176_2190" title="Referenced at line 52">QuotedBracket4</a><span class="keyword">-LEX</span>               = [\&lt;\&gt;]
  <a href="#Dollar4_2660_2667" id="Dollar4_2220_2227" title="Referenced at line 70">Dollar4</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>
      
  <span class="layout">// Padding is a dummy lexical that will contain the indentation prefix of every quotation</span>
  <a href="#Padding_2370_2377" id="Padding_2360_2367" title="Referenced at line 58">Padding</a> = <a href="#Padding_340_347" id="Padding_2370_2377" title="Defined at line 15, 58, 59">Padding</a><span class="keyword">-LEX</span> 
  <a href="#Padding_2370_2377" id="Padding_2385_2392" title="Referenced at line 58">Padding</a><span class="keyword">-LEX</span> = {<span class="cons_Unquoted">indentpadding</span>}
  
<span class="keyword">lexical restrictions</span>

  <a href="#StringQuotedChars1_110_128" id="StringQuotedChars1_2442_2460" title="Defined at line 11, 26">StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StringQuotedChars2_172_190" id="StringQuotedChars2_2477_2495" title="Defined at line 12, 35">StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StringQuotedChars3_234_252" id="StringQuotedChars3_2512_2530" title="Defined at line 13, 44">StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StringQuotedChars4_296_314" id="StringQuotedChars4_2547_2565" title="Defined at line 14, 53">StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]
  <a href="#Dollar1_144_151" id="Dollar1_2582_2589" title="Defined at line 11, 28">Dollar1</a> -/- [\[\]].[\$]
  <a href="#Dollar2_206_213" id="Dollar2_2608_2615" title="Defined at line 12, 37">Dollar2</a> -/- [\{\}].[\$]
  <a href="#Dollar3_268_275" id="Dollar3_2634_2641" title="Defined at line 13, 46">Dollar3</a> -/- [\(\)].[\$]
  <a href="#Dollar4_330_337" id="Dollar4_2660_2667" title="Defined at line 14, 55">Dollar4</a> -/- [\&lt;\&gt;].[\$]

</code></pre></td></tr></tbody></table></div>