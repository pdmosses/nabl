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
<td class="code"><pre><code><span class="keyword">module</span> <span id="terms/StringQuotations_1_8" title="Not referenced">terms/StringQuotations</span>

<span class="keyword">imports</span> 

  <a href="../Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="Defined at ../Terms.sdf3 line 1">terms/Terms</a>

<span class="keyword">sorts</span>

  <span id="PPTerm_9_3" title="Not referenced">PPTerm</span>
  <a href="#StringQuotation_19_15" id="StringQuotation_10_3" title="Referenced at line 19">StringQuotation</a>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_11_3" title="Referenced at line 21">StringQuotedPart1</a> <a href="#StringQuotedChars1_23_38" id="StringQuotedChars1_11_21" title="Referenced at line 23, 63">StringQuotedChars1</a> <a href="#QuotedBracket1_25_42" id="QuotedBracket1_11_40" title="Referenced at line 25">QuotedBracket1</a> <a href="#Dollar1_24_38" id="Dollar1_11_55" title="Referenced at line 24, 67">Dollar1</a>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_12_3" title="Referenced at line 30">StringQuotedPart2</a> <a href="#StringQuotedChars2_32_38" id="StringQuotedChars2_12_21" title="Referenced at line 32, 64">StringQuotedChars2</a> <a href="#QuotedBracket2_34_42" id="QuotedBracket2_12_40" title="Referenced at line 34">QuotedBracket2</a> <a href="#Dollar2_33_38" id="Dollar2_12_55" title="Referenced at line 33, 68">Dollar2</a>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_13_3" title="Referenced at line 39">StringQuotedPart3</a> <a href="#StringQuotedChars3_41_38" id="StringQuotedChars3_13_21" title="Referenced at line 41, 65">StringQuotedChars3</a> <a href="#QuotedBracket3_43_42" id="QuotedBracket3_13_40" title="Referenced at line 43">QuotedBracket3</a> <a href="#Dollar3_42_38" id="Dollar3_13_55" title="Referenced at line 42, 69">Dollar3</a>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_14_3" title="Referenced at line 48">StringQuotedPart4</a> <a href="#StringQuotedChars4_50_38" id="StringQuotedChars4_14_21" title="Referenced at line 50, 66">StringQuotedChars4</a> <a href="#QuotedBracket4_52_42" id="QuotedBracket4_14_40" title="Referenced at line 52">QuotedBracket4</a> <a href="#Dollar4_51_38" id="Dollar4_14_55" title="Referenced at line 51, 70">Dollar4</a>
  <a href="#Padding_21_46" id="Padding_15_3" title="Referenced at line 21, 22, 30, 31, 39, 40, 48, 49, 58">Padding</a>

<span class="keyword">syntax</span>
  
  <span id="PPTerm_19_3" title="Not referenced">PPTerm</span><span class="keyword">-CF</span> = <a href="#StringQuotation_10_3" id="StringQuotation_19_15" title="Defined at line 10, 21, 30, 39, 48">StringQuotation</a>
  
  <a href="#StringQuotation_19_15" id="StringQuotation_21_3" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation1_21_19" title="Not referenced">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#Padding_15_3" id="Padding_21_46" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart1_11_3" id="StringQuotedPart1_21_54" title="Defined at line 11, 22, 23, 24, 25">StringQuotedPart1</a>* <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_22_3" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="StringEscape1_22_21" title="Not referenced">StringEscape1</span></span>  = <a href="#Padding_15_3" id="Padding_22_38" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_22_61" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_23_3" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr_23_21" title="Not referenced">QStr</span></span>           = <a href="#StringQuotedChars1_11_21" id="StringQuotedChars1_23_38" title="Defined at line 11, 26">StringQuotedChars1</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_24_3" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar_24_21" title="Not referenced">QDollar</span></span>        = <a href="#Dollar1_11_55" id="Dollar1_24_38" title="Defined at line 11, 28">Dollar1</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_25_3" title="Referenced at line 21">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr_25_21" title="Not referenced">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket1_11_40" id="QuotedBracket1_25_42" title="Defined at line 11, 27">QuotedBracket1</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars1_23_38" id="StringQuotedChars1_26_3" title="Referenced at line 23, 63">StringQuotedChars1</a><span class="keyword">-LEX</span>           = ~[\[\]\$]+
  <a href="#QuotedBracket1_25_42" id="QuotedBracket1_27_3" title="Referenced at line 25">QuotedBracket1</a><span class="keyword">-LEX</span>               = [\[\]]
  <a href="#Dollar1_24_38" id="Dollar1_28_3" title="Referenced at line 24, 67">Dollar1</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>
  
  <a href="#StringQuotation_19_15" id="StringQuotation_30_3" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation2_30_19" title="Not referenced">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#Padding_15_3" id="Padding_30_46" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart2_12_3" id="StringQuotedPart2_30_54" title="Defined at line 12, 31, 32, 33, 34">StringQuotedPart2</a>* <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_31_3" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="StringEscape2_31_21" title="Not referenced">StringEscape2</span></span>  =  <a href="#Padding_15_3" id="Padding_31_39" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_31_62" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_32_3" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr_32_21" title="Not referenced">QStr</span></span>           = <a href="#StringQuotedChars2_12_21" id="StringQuotedChars2_32_38" title="Defined at line 12, 35">StringQuotedChars2</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_33_3" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar_33_21" title="Not referenced">QDollar</span></span>        = <a href="#Dollar2_12_55" id="Dollar2_33_38" title="Defined at line 12, 37">Dollar2</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_34_3" title="Referenced at line 30">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr_34_21" title="Not referenced">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket2_12_40" id="QuotedBracket2_34_42" title="Defined at line 12, 36">QuotedBracket2</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars2_32_38" id="StringQuotedChars2_35_3" title="Referenced at line 32, 64">StringQuotedChars2</a><span class="keyword">-LEX</span>           = ~[\{\}\$]+
  <a href="#QuotedBracket2_34_42" id="QuotedBracket2_36_3" title="Referenced at line 34">QuotedBracket2</a><span class="keyword">-LEX</span>               = [\{\}]
  <a href="#Dollar2_33_38" id="Dollar2_37_3" title="Referenced at line 33, 68">Dollar2</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>

  <a href="#StringQuotation_19_15" id="StringQuotation_39_3" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation3_39_19" title="Not referenced">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#Padding_15_3" id="Padding_39_46" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart3_13_3" id="StringQuotedPart3_39_54" title="Defined at line 13, 40, 41, 42, 43">StringQuotedPart3</a>* <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_40_3" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="StringEscape3_40_21" title="Not referenced">StringEscape3</span></span>  = <a href="#Padding_15_3" id="Padding_40_38" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_40_61" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_41_3" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr_41_21" title="Not referenced">QStr</span></span>           = <a href="#StringQuotedChars3_13_21" id="StringQuotedChars3_41_38" title="Defined at line 13, 44">StringQuotedChars3</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_42_3" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar_42_21" title="Not referenced">QDollar</span></span>        = <a href="#Dollar3_13_55" id="Dollar3_42_38" title="Defined at line 13, 46">Dollar3</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_43_3" title="Referenced at line 39">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr_43_21" title="Not referenced">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket3_13_40" id="QuotedBracket3_43_42" title="Defined at line 13, 45">QuotedBracket3</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars3_41_38" id="StringQuotedChars3_44_3" title="Referenced at line 41, 65">StringQuotedChars3</a><span class="keyword">-LEX</span>           = ~[\(\)\$]+
  <a href="#QuotedBracket3_43_42" id="QuotedBracket3_45_3" title="Referenced at line 43">QuotedBracket3</a><span class="keyword">-LEX</span>               = [\(\)]
  <a href="#Dollar3_42_38" id="Dollar3_46_3" title="Referenced at line 42, 69">Dollar3</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>

  <a href="#StringQuotation_19_15" id="StringQuotation_48_3" title="Referenced at line 19">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation4_48_19" title="Not referenced">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#Padding_15_3" id="Padding_48_46" title="Defined at line 15, 58, 59">Padding</a> <a href="#StringQuotedPart4_14_3" id="StringQuotedPart4_48_54" title="Defined at line 14, 49, 50, 51, 52">StringQuotedPart4</a>* <span class="cons_Lit">"&gt;"</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_49_3" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="StringEscape4_49_21" title="Not referenced">StringEscape4</span></span>  = <a href="#Padding_15_3" id="Padding_49_38" title="Defined at line 15, 58, 59">Padding</a> <span class="cons_Lit">"&lt;"</span>  <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_49_62" title="Defined at ../Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_50_3" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr_50_21" title="Not referenced">QStr</span></span>           = <a href="#StringQuotedChars4_14_21" id="StringQuotedChars4_50_38" title="Defined at line 14, 53">StringQuotedChars4</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_51_3" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar_51_21" title="Not referenced">QDollar</span></span>        = <a href="#Dollar4_14_55" id="Dollar4_51_38" title="Defined at line 14, 55">Dollar4</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_52_3" title="Referenced at line 48">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr_52_21" title="Not referenced">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket4_14_40" id="QuotedBracket4_52_42" title="Defined at line 14, 54">QuotedBracket4</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <a href="#StringQuotedChars4_50_38" id="StringQuotedChars4_53_3" title="Referenced at line 50, 66">StringQuotedChars4</a><span class="keyword">-LEX</span>           = ~[\&lt;\&gt;\$]+
  <a href="#QuotedBracket4_52_42" id="QuotedBracket4_54_3" title="Referenced at line 52">QuotedBracket4</a><span class="keyword">-LEX</span>               = [\&lt;\&gt;]
  <a href="#Dollar4_51_38" id="Dollar4_55_3" title="Referenced at line 51, 70">Dollar4</a><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>
      
  <span class="layout">// Padding is a dummy lexical that will contain the indentation prefix of every quotation</span>
  <a href="#Padding_21_46" id="Padding_58_3" title="Referenced at line 21, 22, 30, 31, 39, 40, 48, 49, 58">Padding</a> = <a href="#Padding_15_3" id="Padding_58_13" title="Defined at line 15, 58, 59">Padding</a><span class="keyword">-LEX</span> 
  <a href="#Padding_21_46" id="Padding_59_3" title="Referenced at line 21, 22, 30, 31, 39, 40, 48, 49, 58">Padding</a><span class="keyword">-LEX</span> = {<span class="cons_Unquoted">indentpadding</span>}
  
<span class="keyword">lexical restrictions</span>

  <a href="#StringQuotedChars1_11_21" id="StringQuotedChars1_63_3" title="Defined at line 11, 26">StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StringQuotedChars2_12_21" id="StringQuotedChars2_64_3" title="Defined at line 12, 35">StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StringQuotedChars3_13_21" id="StringQuotedChars3_65_3" title="Defined at line 13, 44">StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StringQuotedChars4_14_21" id="StringQuotedChars4_66_3" title="Defined at line 14, 53">StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]
  <a href="#Dollar1_11_55" id="Dollar1_67_3" title="Defined at line 11, 28">Dollar1</a> -/- [\[\]].[\$]
  <a href="#Dollar2_12_55" id="Dollar2_68_3" title="Defined at line 12, 37">Dollar2</a> -/- [\{\}].[\$]
  <a href="#Dollar3_13_55" id="Dollar3_69_3" title="Defined at line 13, 46">Dollar3</a> -/- [\(\)].[\$]
  <a href="#Dollar4_14_55" id="Dollar4_70_3" title="Defined at line 14, 55">Dollar4</a> -/- [\&lt;\&gt;].[\$]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
