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
<td class="code"><pre><code><span class="keyword">module</span> <span id="terms/StringQuotations_1_8" title="a definition with no references">terms/StringQuotations</span>

<span class="keyword">imports</span> 

  <a href="../Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="a reference to a single-file definition">terms/Terms</a>

<span class="keyword">sorts</span>

  <span id="PPTerm_9_3" title="a definition with no references">PPTerm</span>
  <a href="#StringQuotation_19_15" id="StringQuotation_10_3" title="a definition with a single reference">StringQuotation</a>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_11_3" title="a definition with a single reference">StringQuotedPart1</a> <button class="modal-open" id="StringQuotedChars1_11_21" title="a definition with multiple references" data-urls="#StringQuotedChars1 line 23_38, 63_3">StringQuotedChars1</button> <a href="#QuotedBracket1_25_42" id="QuotedBracket1_11_40" title="a definition with a single reference">QuotedBracket1</a> <button class="modal-open" id="Dollar1_11_55" title="a definition with multiple references" data-urls="#Dollar1 line 24_38, 67_3">Dollar1</button>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_12_3" title="a definition with a single reference">StringQuotedPart2</a> <button class="modal-open" id="StringQuotedChars2_12_21" title="a definition with multiple references" data-urls="#StringQuotedChars2 line 32_38, 64_3">StringQuotedChars2</button> <a href="#QuotedBracket2_34_42" id="QuotedBracket2_12_40" title="a definition with a single reference">QuotedBracket2</a> <button class="modal-open" id="Dollar2_12_55" title="a definition with multiple references" data-urls="#Dollar2 line 33_38, 68_3">Dollar2</button>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_13_3" title="a definition with a single reference">StringQuotedPart3</a> <button class="modal-open" id="StringQuotedChars3_13_21" title="a definition with multiple references" data-urls="#StringQuotedChars3 line 41_38, 65_3">StringQuotedChars3</button> <a href="#QuotedBracket3_43_42" id="QuotedBracket3_13_40" title="a definition with a single reference">QuotedBracket3</a> <button class="modal-open" id="Dollar3_13_55" title="a definition with multiple references" data-urls="#Dollar3 line 42_38, 69_3">Dollar3</button>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_14_3" title="a definition with a single reference">StringQuotedPart4</a> <button class="modal-open" id="StringQuotedChars4_14_21" title="a definition with multiple references" data-urls="#StringQuotedChars4 line 50_38, 66_3">StringQuotedChars4</button> <a href="#QuotedBracket4_52_42" id="QuotedBracket4_14_40" title="a definition with a single reference">QuotedBracket4</a> <button class="modal-open" id="Dollar4_14_55" title="a definition with multiple references" data-urls="#Dollar4 line 51_38, 70_3">Dollar4</button>
  <button class="modal-open" id="Padding_15_3" title="a definition with multiple references" data-urls="#Padding line 21_46, 22_38, 30_46, 31_39, 39_46, 40_38, 48_46, 49_38, 58_13">Padding</button>

<span class="keyword">syntax</span>
  
  <span id="PPTerm_19_3" title="a definition with no references">PPTerm</span><span class="keyword">-CF</span> = <a href="#StringQuotation_10_3" id="StringQuotation_19_15" title="a reference to a single-file definition">StringQuotation</a>
  
  <a href="#StringQuotation_19_15" id="StringQuotation_21_3" title="a definition with a single reference">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation1_21_19" title="a definition with no references">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#Padding_15_3" id="Padding_21_46" title="a reference to a single-file definition">Padding</a> <a href="#StringQuotedPart1_11_3" id="StringQuotedPart1_21_54" title="a reference to a single-file definition">StringQuotedPart1</a>* <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_22_3" title="a definition with a single reference">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="StringEscape1_22_21" title="a definition with no references">StringEscape1</span></span>  = <a href="#Padding_15_3" id="Padding_22_38" title="a reference to a single-file definition">Padding</a> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_22_61" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_23_3" title="a definition with a single reference">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr_23_21" title="a definition with no references">QStr</span></span>           = <a href="#StringQuotedChars1_11_21" id="StringQuotedChars1_23_38" title="a reference to a single-file definition">StringQuotedChars1</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_24_3" title="a definition with a single reference">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar_24_21" title="a definition with no references">QDollar</span></span>        = <a href="#Dollar1_11_55" id="Dollar1_24_38" title="a reference to a single-file definition">Dollar1</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart1_21_54" id="StringQuotedPart1_25_3" title="a definition with a single reference">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr_25_21" title="a definition with no references">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket1_11_40" id="QuotedBracket1_25_42" title="a reference to a single-file definition">QuotedBracket1</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="StringQuotedChars1_26_3" title="a definition with multiple references" data-urls="#StringQuotedChars1 line 23_38, 63_3">StringQuotedChars1</button><span class="keyword">-LEX</span>           = ~[\[\]\$]+
  <a href="#QuotedBracket1_25_42" id="QuotedBracket1_27_3" title="a definition with a single reference">QuotedBracket1</a><span class="keyword">-LEX</span>               = [\[\]]
  <button class="modal-open" id="Dollar1_28_3" title="a definition with multiple references" data-urls="#Dollar1 line 24_38, 67_3">Dollar1</button><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>
  
  <a href="#StringQuotation_19_15" id="StringQuotation_30_3" title="a definition with a single reference">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation2_30_19" title="a definition with no references">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#Padding_15_3" id="Padding_30_46" title="a reference to a single-file definition">Padding</a> <a href="#StringQuotedPart2_12_3" id="StringQuotedPart2_30_54" title="a reference to a single-file definition">StringQuotedPart2</a>* <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_31_3" title="a definition with a single reference">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="StringEscape2_31_21" title="a definition with no references">StringEscape2</span></span>  =  <a href="#Padding_15_3" id="Padding_31_39" title="a reference to a single-file definition">Padding</a> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_31_62" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_32_3" title="a definition with a single reference">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr_32_21" title="a definition with no references">QStr</span></span>           = <a href="#StringQuotedChars2_12_21" id="StringQuotedChars2_32_38" title="a reference to a single-file definition">StringQuotedChars2</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_33_3" title="a definition with a single reference">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar_33_21" title="a definition with no references">QDollar</span></span>        = <a href="#Dollar2_12_55" id="Dollar2_33_38" title="a reference to a single-file definition">Dollar2</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart2_30_54" id="StringQuotedPart2_34_3" title="a definition with a single reference">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr_34_21" title="a definition with no references">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket2_12_40" id="QuotedBracket2_34_42" title="a reference to a single-file definition">QuotedBracket2</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="StringQuotedChars2_35_3" title="a definition with multiple references" data-urls="#StringQuotedChars2 line 32_38, 64_3">StringQuotedChars2</button><span class="keyword">-LEX</span>           = ~[\{\}\$]+
  <a href="#QuotedBracket2_34_42" id="QuotedBracket2_36_3" title="a definition with a single reference">QuotedBracket2</a><span class="keyword">-LEX</span>               = [\{\}]
  <button class="modal-open" id="Dollar2_37_3" title="a definition with multiple references" data-urls="#Dollar2 line 33_38, 68_3">Dollar2</button><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>

  <a href="#StringQuotation_19_15" id="StringQuotation_39_3" title="a definition with a single reference">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation3_39_19" title="a definition with no references">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#Padding_15_3" id="Padding_39_46" title="a reference to a single-file definition">Padding</a> <a href="#StringQuotedPart3_13_3" id="StringQuotedPart3_39_54" title="a reference to a single-file definition">StringQuotedPart3</a>* <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_40_3" title="a definition with a single reference">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="StringEscape3_40_21" title="a definition with no references">StringEscape3</span></span>  = <a href="#Padding_15_3" id="Padding_40_38" title="a reference to a single-file definition">Padding</a> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_40_61" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_41_3" title="a definition with a single reference">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr_41_21" title="a definition with no references">QStr</span></span>           = <a href="#StringQuotedChars3_13_21" id="StringQuotedChars3_41_38" title="a reference to a single-file definition">StringQuotedChars3</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_42_3" title="a definition with a single reference">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar_42_21" title="a definition with no references">QDollar</span></span>        = <a href="#Dollar3_13_55" id="Dollar3_42_38" title="a reference to a single-file definition">Dollar3</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart3_39_54" id="StringQuotedPart3_43_3" title="a definition with a single reference">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr_43_21" title="a definition with no references">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket3_13_40" id="QuotedBracket3_43_42" title="a reference to a single-file definition">QuotedBracket3</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="StringQuotedChars3_44_3" title="a definition with multiple references" data-urls="#StringQuotedChars3 line 41_38, 65_3">StringQuotedChars3</button><span class="keyword">-LEX</span>           = ~[\(\)\$]+
  <a href="#QuotedBracket3_43_42" id="QuotedBracket3_45_3" title="a definition with a single reference">QuotedBracket3</a><span class="keyword">-LEX</span>               = [\(\)]
  <button class="modal-open" id="Dollar3_46_3" title="a definition with multiple references" data-urls="#Dollar3 line 42_38, 69_3">Dollar3</button><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>

  <a href="#StringQuotation_19_15" id="StringQuotation_48_3" title="a definition with a single reference">StringQuotation</a>.<span class="cons_Constructor"><span id="StringQuotation4_48_19" title="a definition with no references">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#Padding_15_3" id="Padding_48_46" title="a reference to a single-file definition">Padding</a> <a href="#StringQuotedPart4_14_3" id="StringQuotedPart4_48_54" title="a reference to a single-file definition">StringQuotedPart4</a>* <span class="cons_Lit">"&gt;"</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_49_3" title="a definition with a single reference">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="StringEscape4_49_21" title="a definition with no references">StringEscape4</span></span>  = <a href="#Padding_15_3" id="Padding_49_38" title="a reference to a single-file definition">Padding</a> <span class="cons_Lit">"&lt;"</span>  <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Terms.sdf3/#Term_29_3" id="Term_49_62" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_50_3" title="a definition with a single reference">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr_50_21" title="a definition with no references">QStr</span></span>           = <a href="#StringQuotedChars4_14_21" id="StringQuotedChars4_50_38" title="a reference to a single-file definition">StringQuotedChars4</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_51_3" title="a definition with a single reference">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar_51_21" title="a definition with no references">QDollar</span></span>        = <a href="#Dollar4_14_55" id="Dollar4_51_38" title="a reference to a single-file definition">Dollar4</a><span class="keyword">-LEX</span>
  <a href="#StringQuotedPart4_48_54" id="StringQuotedPart4_52_3" title="a definition with a single reference">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr_52_21" title="a definition with no references">QBr</span></span>            = <span class="cons_Lit">"$"</span> <a href="#QuotedBracket4_14_40" id="QuotedBracket4_52_42" title="a reference to a single-file definition">QuotedBracket4</a><span class="keyword">-LEX</span> <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="StringQuotedChars4_53_3" title="a definition with multiple references" data-urls="#StringQuotedChars4 line 50_38, 66_3">StringQuotedChars4</button><span class="keyword">-LEX</span>           = ~[\&lt;\&gt;\$]+
  <a href="#QuotedBracket4_52_42" id="QuotedBracket4_54_3" title="a definition with a single reference">QuotedBracket4</a><span class="keyword">-LEX</span>               = [\&lt;\&gt;]
  <button class="modal-open" id="Dollar4_55_3" title="a definition with multiple references" data-urls="#Dollar4 line 51_38, 70_3">Dollar4</button><span class="keyword">-LEX</span>                      = <span class="cons_Lit">"$"</span>
      
  <span class="layout">// Padding is a dummy lexical that will contain the indentation prefix of every quotation</span>
  <button class="modal-open" id="Padding_58_3" title="a definition with multiple references" data-urls="#Padding line 21_46, 22_38, 30_46, 31_39, 39_46, 40_38, 48_46, 49_38, 58_13">Padding</button> = <a href="#Padding_15_3" id="Padding_58_13" title="a reference to a single-file definition">Padding</a><span class="keyword">-LEX</span> 
  <button class="modal-open" id="Padding_59_3" title="a definition with multiple references" data-urls="#Padding line 21_46, 22_38, 30_46, 31_39, 39_46, 40_38, 48_46, 49_38, 58_13">Padding</button><span class="keyword">-LEX</span> = {<span class="cons_Unquoted">indentpadding</span>}
  
<span class="keyword">lexical restrictions</span>

  <a href="#StringQuotedChars1_11_21" id="StringQuotedChars1_63_3" title="a reference to a single-file definition">StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StringQuotedChars2_12_21" id="StringQuotedChars2_64_3" title="a reference to a single-file definition">StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StringQuotedChars3_13_21" id="StringQuotedChars3_65_3" title="a reference to a single-file definition">StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StringQuotedChars4_14_21" id="StringQuotedChars4_66_3" title="a reference to a single-file definition">StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]
  <a href="#Dollar1_11_55" id="Dollar1_67_3" title="a reference to a single-file definition">Dollar1</a> -/- [\[\]].[\$]
  <a href="#Dollar2_12_55" id="Dollar2_68_3" title="a reference to a single-file definition">Dollar2</a> -/- [\{\}].[\$]
  <a href="#Dollar3_13_55" id="Dollar3_69_3" title="a reference to a single-file definition">Dollar3</a> -/- [\(\)].[\$]
  <a href="#Dollar4_14_55" id="Dollar4_70_3" title="a reference to a single-file definition">Dollar4</a> -/- [\&lt;\&gt;].[\$]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
