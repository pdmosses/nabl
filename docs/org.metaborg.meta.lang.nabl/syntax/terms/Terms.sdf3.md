---
title: Terms.sdf3
hide:
  - toc
---

# `Terms.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Terms.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Terms.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/terms/Terms.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Terms_1_8" title="Multi-file references" data-urls="../StringQuotations.sdf3/#terms/Terms_5_3 line 5; ../Vars.sdf3/#terms/Terms_6_3 line 6; ../../NameBindingLanguage.sdf3/#terms/Terms_8_3 line 8; ../../core/Properties.sdf3/#terms/Terms_8_2 line 8; ../../formulas/Formulas.sdf3/#terms/Terms_5_3 line 5; ../../formulas/Messages.sdf3/#terms/Terms_5_3 line 5; ../../formulas/Propositions.sdf3/#terms/Terms_5_3 line 5">terms/Terms</button>

<span class="keyword">imports</span> 

  <a href="../Constants.sdf3/#terms/Constants_1_8" id="terms/Constants_5_3" title="Defined at ../Constants.sdf3 line 1">terms/Constants</a> 
  <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_6_3" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_7_3" title="Defined at ../Vars.sdf3 line 1">terms/Vars</a>

<span class="keyword">sorts</span>

  <button class="modal-open" id="Pattern_11_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Pattern_15_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button> = &lt;&lt;<a href="../Vars.sdf3/#Var_10_7" id="Var_15_15" title="Defined at ../Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_16_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="Int_16_11" title="Not referenced">Int</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Int_5_3" id="Int_16_19" title="Defined at ../Constants.sdf3 line 5, 9">Int</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_17_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="Real_17_11" title="Not referenced">Real</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Real_5_7" id="Real_17_20" title="Defined at ../Constants.sdf3 line 5, 10">Real</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_18_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="Str_18_11" title="Not referenced">Str</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_18_19" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_19_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="Op_19_11" title="Not referenced">Op</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_19_18" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_11_3" id="Pattern_19_24" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Pattern_20_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="OpQ_20_11" title="Not referenced">OpQ</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_20_19" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_11_3" id="Pattern_20_29" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Pattern_21_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="Char_21_11" title="Not referenced">Char</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Char_15_7" id="Char_21_20" title="Defined at ../Constants.sdf3 line 15, 19">Char</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_22_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="Tuple_22_11" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_11_3" id="Pattern_22_23" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Pattern_23_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="List_23_11" title="Not referenced">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Pattern_11_3" id="Pattern_23_22" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; 
  <button class="modal-open" id="Pattern_24_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="ListTail_24_11" title="Not referenced">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Pattern_11_3" id="Pattern_24_26" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Pattern_11_3" id="Pattern_24_45" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>&gt;<span class="cons_String">]</span>&gt; 
  <button class="modal-open" id="Pattern_25_3" title="Multi-file references" data-urls="#Pattern_19_24 line 19, 20, 22, 23, 24, 25; ../../NameBindingLanguage.sdf3/#Pattern_57_4 line 57, 153; ../../formulas/Propositions.sdf3/#Pattern_17_37 line 17">Pattern</button>.<span class="cons_Constructor"><span id="As_25_11" title="Not referenced">As</span></span> = &lt;&lt;<a href="../Vars.sdf3/#Var_10_7" id="Var_25_18" title="Defined at ../Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Pattern_11_3" id="Pattern_25_24" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>&gt;&gt; 

<span class="keyword">sorts</span>

  <button class="modal-open" id="Term_29_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Term_33_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button> = &lt;&lt;<a href="../Vars.sdf3/#VarRef_10_11" id="VarRef_33_12" title="Defined at ../Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;&gt; 
  <button class="modal-open" id="Term_34_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="Int_34_8" title="Not referenced">Int</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Int_5_3" id="Int_34_16" title="Defined at ../Constants.sdf3 line 5, 9">Int</a>&gt;&gt; 
  <button class="modal-open" id="Term_35_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="Real_35_8" title="Not referenced">Real</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Real_5_7" id="Real_35_17" title="Defined at ../Constants.sdf3 line 5, 10">Real</a>&gt;&gt; 
  <button class="modal-open" id="Term_36_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="Str_36_8" title="Not referenced">Str</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_36_16" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;&gt; 
  <button class="modal-open" id="Term_37_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="Op_37_8" title="Not referenced">Op</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_37_15" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_29_3" id="Term_37_21" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Term_38_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="OpQ_38_8" title="Not referenced">OpQ</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_38_16" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_29_3" id="Term_38_26" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Term_39_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="Char_39_8" title="Not referenced">Char</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Char_15_7" id="Char_39_17" title="Defined at ../Constants.sdf3 line 15, 19">Char</a>&gt;&gt; 
  <button class="modal-open" id="Term_40_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="Tuple_40_8" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_29_3" id="Term_40_20" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Term_41_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="List_41_8" title="Not referenced">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_29_3" id="Term_41_19" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; 
  <button class="modal-open" id="Term_42_3" title="Multi-file references" data-urls="#Term_37_21 line 37, 38, 40, 41, 42; ../StringQuotations.sdf3/#Term_22_61 line 22, 31, 40, 49; ../../NameBindingLanguage.sdf3/#Term_36_50 line 36, 38, 62, 85, 92, 97, 100, 106, 112, 126, 136, 137; ../../formulas/Messages.sdf3/#Term_9_37 line 9; ../../formulas/Propositions.sdf3/#Term_15_34 line 15, 21, 24">Term</button>.<span class="cons_Constructor"><span id="ListTail_42_8" title="Not referenced">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_29_3" id="Term_42_23" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Term_29_3" id="Term_42_39" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;<span class="cons_String">]</span>&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
