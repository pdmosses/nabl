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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Terms_1_8" title="a definition with multiple references" data-urls="../StringQuotations.sdf3/#terms/Terms line 5_3; ../Vars.sdf3/#terms/Terms line 6_3; ../../NameBindingLanguage.sdf3/#terms/Terms line 8_3; ../../core/Properties.sdf3/#terms/Terms line 8_2; ../../formulas/Formulas.sdf3/#terms/Terms line 5_3; ../../formulas/Messages.sdf3/#terms/Terms line 5_3; ../../formulas/Propositions.sdf3/#terms/Terms line 5_3">terms/Terms</button>

<span class="keyword">imports</span> 

  <a href="../Constants.sdf3/#terms/Constants_1_8" id="terms/Constants_5_3" title="a reference to a single-file definition">terms/Constants</a> 
  <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_6_3" title="a reference to a single-file definition">common/Identifiers</a>  
  <a href="../Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_7_3" title="a reference to a single-file definition">terms/Vars</a>

<span class="keyword">sorts</span>

  <button class="modal-open" id="Pattern_11_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Pattern_15_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button> = &lt;&lt;<a href="../Vars.sdf3/#Var_10_7" id="Var_15_15" title="a reference to a single-file definition">Var</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_16_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="Int_16_11" title="a definition with no references">Int</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Int_5_3" id="Int_16_19" title="a reference to a single-file definition">Int</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_17_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="Real_17_11" title="a definition with no references">Real</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Real_5_7" id="Real_17_20" title="a reference to a single-file definition">Real</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_18_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="Str_18_11" title="a definition with no references">Str</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_18_19" title="a reference to a single-file definition">String</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_19_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="Op_19_11" title="a definition with no references">Op</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_19_18" title="a reference to a single-file definition">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_11_3" id="Pattern_19_24" title="a reference to a single-file definition">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Pattern_20_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="OpQ_20_11" title="a definition with no references">OpQ</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_20_19" title="a reference to a single-file definition">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_11_3" id="Pattern_20_29" title="a reference to a single-file definition">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Pattern_21_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="Char_21_11" title="a definition with no references">Char</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Char_15_7" id="Char_21_20" title="a reference to a single-file definition">Char</a>&gt;&gt; 
  <button class="modal-open" id="Pattern_22_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="Tuple_22_11" title="a definition with no references">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_11_3" id="Pattern_22_23" title="a reference to a single-file definition">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Pattern_23_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="List_23_11" title="a definition with no references">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Pattern_11_3" id="Pattern_23_22" title="a reference to a single-file definition">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; 
  <button class="modal-open" id="Pattern_24_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="ListTail_24_11" title="a definition with no references">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Pattern_11_3" id="Pattern_24_26" title="a reference to a single-file definition">Pattern</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Pattern_11_3" id="Pattern_24_45" title="a reference to a single-file definition">Pattern</a>&gt;<span class="cons_String">]</span>&gt; 
  <button class="modal-open" id="Pattern_25_3" title="a definition with multiple references" data-urls="#Pattern line 19_24, 20_29, 22_23, 23_22, 24_26, 24_45, 25_24; ../../NameBindingLanguage.sdf3/#Pattern line 57_4, 153_62; ../../formulas/Propositions.sdf3/#Pattern line 17_37">Pattern</button>.<span class="cons_Constructor"><span id="As_25_11" title="a definition with no references">As</span></span> = &lt;&lt;<a href="../Vars.sdf3/#Var_10_7" id="Var_25_18" title="a reference to a single-file definition">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Pattern_11_3" id="Pattern_25_24" title="a reference to a single-file definition">Pattern</a>&gt;&gt; 

<span class="keyword">sorts</span>

  <button class="modal-open" id="Term_29_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Term_33_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button> = &lt;&lt;<a href="../Vars.sdf3/#VarRef_10_11" id="VarRef_33_12" title="a reference to a single-file definition">VarRef</a>&gt;&gt; 
  <button class="modal-open" id="Term_34_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="Int_34_8" title="a definition with no references">Int</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Int_5_3" id="Int_34_16" title="a reference to a single-file definition">Int</a>&gt;&gt; 
  <button class="modal-open" id="Term_35_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="Real_35_8" title="a definition with no references">Real</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Real_5_7" id="Real_35_17" title="a reference to a single-file definition">Real</a>&gt;&gt; 
  <button class="modal-open" id="Term_36_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="Str_36_8" title="a definition with no references">Str</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_36_16" title="a reference to a single-file definition">String</a>&gt;&gt; 
  <button class="modal-open" id="Term_37_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="Op_37_8" title="a definition with no references">Op</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_37_15" title="a reference to a single-file definition">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_29_3" id="Term_37_21" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Term_38_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="OpQ_38_8" title="a definition with no references">OpQ</span></span> = &lt;&lt;<a href="../Constants.sdf3/#String_5_12" id="String_38_16" title="a reference to a single-file definition">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_29_3" id="Term_38_26" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Term_39_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="Char_39_8" title="a definition with no references">Char</span></span> = &lt;&lt;<a href="../Constants.sdf3/#Char_15_7" id="Char_39_17" title="a reference to a single-file definition">Char</a>&gt;&gt; 
  <button class="modal-open" id="Term_40_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="Tuple_40_8" title="a definition with no references">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_29_3" id="Term_40_20" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <button class="modal-open" id="Term_41_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="List_41_8" title="a definition with no references">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_29_3" id="Term_41_19" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; 
  <button class="modal-open" id="Term_42_3" title="a definition with multiple references" data-urls="#Term line 37_21, 38_26, 40_20, 41_19, 42_23, 42_39; ../StringQuotations.sdf3/#Term line 22_61, 31_62, 40_61, 49_62; ../../NameBindingLanguage.sdf3/#Term line 36_50, 38_69, 62_48, 85_45, 92_43, 97_22, 100_29, 106_35, 112_23, 112_41, 126_25, 136_55, 137_25; ../../formulas/Messages.sdf3/#Term line 9_37, 9_47; ../../formulas/Propositions.sdf3/#Term line 15_34, 21_30, 24_30, 24_48">Term</button>.<span class="cons_Constructor"><span id="ListTail_42_8" title="a definition with no references">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_29_3" id="Term_42_23" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Term_29_3" id="Term_42_39" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">]</span>&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
