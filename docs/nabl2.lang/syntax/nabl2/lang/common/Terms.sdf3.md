---
title: Terms.sdf3
hide:
  - toc
---

# `Terms.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/Terms.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/Terms.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/common/Terms.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/common/Terms_1_8" title="a definition with multiple references" data-urls="../CTerms.sdf3/#nabl2/lang/common/Terms line 10_3; ../Injections.sdf3/#nabl2/lang/common/Terms line 11_3; ../Main.sdf3/#nabl2/lang/common/Terms line 9_3; ../Messages.sdf3/#nabl2/lang/common/Terms line 6_3; ../../rules/CGen.sdf3/#nabl2/lang/common/Terms line 11_3">nabl2/lang/common/Terms</button>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_5_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="NaBL2-Var_13_3" title="a definition with multiple references" data-urls="#NaBL2-Var line 16_21, 23_30; ../Injections.sdf3/#NaBL2-Var line 22_55, 25_55, 41_42; ../../rules/CGen.sdf3/#NaBL2-Var line 38_61">NaBL2-Var</button>.<span class="cons_Constructor"><span id="Var_13_13" title="a definition with no references">Var</span></span>   = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-VarId_19_3" id="NaBL2-VarId_13_21" title="a reference to a single-file definition">NaBL2-VarId</a>
  <a href="#NaBL2-Wld_17_21" id="NaBL2-Wld_14_3" title="a definition with a single reference">NaBL2-Wld</a>.<span class="cons_Constructor"><span id="Wld_14_13" title="a definition with no references">Wld</span></span>   = <span class="cons_Lit">"_"</span>

  <button class="modal-open" id="NaBL2-VarOrWld_16_3" title="a definition with multiple references" data-urls="#NaBL2-VarOrWld line 19_28; ../../rules/CGen.sdf3/#NaBL2-VarOrWld line 47_41">NaBL2-VarOrWld</button>  = <a href="#NaBL2-Var_13_3" id="NaBL2-Var_16_21" title="a reference to a single-file definition">NaBL2-Var</a>
  <button class="modal-open" id="NaBL2-VarOrWld_17_3" title="a definition with multiple references" data-urls="#NaBL2-VarOrWld line 19_28; ../../rules/CGen.sdf3/#NaBL2-VarOrWld line 47_41">NaBL2-VarOrWld</button>  = <a href="#NaBL2-Wld_14_3" id="NaBL2-Wld_17_21" title="a reference to a single-file definition">NaBL2-Wld</a>

  <button class="modal-open" id="NaBL2-Pattern_19_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>          = <a href="#NaBL2-VarOrWld_16_3" id="NaBL2-VarOrWld_19_28" title="a reference to a single-file definition">NaBL2-VarOrWld</a>
  <button class="modal-open" id="NaBL2-Pattern_20_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>.<span class="cons_Constructor"><span id="List_20_17" title="a definition with no references">List</span></span>     = &lt;<span class="cons_String">[</span>&lt;{<a href="#NaBL2-Pattern_19_3" id="NaBL2-Pattern_20_32" title="a reference to a single-file definition">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt;
  <button class="modal-open" id="NaBL2-Pattern_21_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>.<span class="cons_Constructor"><span id="ListTail_21_17" title="a definition with no references">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#NaBL2-Pattern_19_3" id="NaBL2-Pattern_21_32" title="a reference to a single-file definition">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;<a href="#NaBL2-Pattern_19_3" id="NaBL2-Pattern_21_55" title="a reference to a single-file definition">NaBL2-Pattern</a>&gt;<span class="cons_String">]</span>&gt;
  <button class="modal-open" id="NaBL2-Pattern_22_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>.<span class="cons_Constructor"><span id="Tuple_22_17" title="a definition with no references">Tuple</span></span>    = &lt;<span class="cons_String">(</span>&lt;{<a href="#NaBL2-Pattern_19_3" id="NaBL2-Pattern_22_32" title="a reference to a single-file definition">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="NaBL2-Pattern_23_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>.<span class="cons_Constructor"><span id="As_23_17" title="a definition with no references">As</span></span>       = &lt;&lt;<a href="#NaBL2-Var_13_3" id="NaBL2-Var_23_30" title="a reference to a single-file definition">NaBL2-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#NaBL2-Pattern_19_3" id="NaBL2-Pattern_23_42" title="a reference to a single-file definition">NaBL2-Pattern</a>&gt;&gt;
  <button class="modal-open" id="NaBL2-Pattern_24_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>          = <a href="#NaBL2-OpTerm_36_3" id="NaBL2-OpTerm_24_28" title="a reference to a single-file definition">NaBL2-OpTerm</a>
  <button class="modal-open" id="NaBL2-Pattern_25_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>          = <a href="#NaBL2-IntTerm_32_3" id="NaBL2-IntTerm_25_28" title="a reference to a single-file definition">NaBL2-IntTerm</a>
  <button class="modal-open" id="NaBL2-Pattern_26_3" title="a definition with multiple references" data-urls="#NaBL2-Pattern line 20_32, 21_32, 21_55, 22_32, 23_42, 28_31; ../../rules/CGen.sdf3/#NaBL2-Pattern line 28_29, 32_29">NaBL2-Pattern</button>          = <a href="#NaBL2-StringTerm_38_3" id="NaBL2-StringTerm_26_28" title="a reference to a single-file definition">NaBL2-StringTerm</a>

  <a href="#NaBL2-Patterns_36_59" id="NaBL2-Patterns_28_3" title="a definition with a single reference">NaBL2-Patterns</a>         = &lt;&lt;{<a href="#NaBL2-Pattern_19_3" id="NaBL2-Pattern_28_31" title="a reference to a single-file definition">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;&gt;

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="NaBL2-IntTerm_32_3" title="a definition with multiple references" data-urls="#NaBL2-IntTerm line 25_28; ../CTerms.sdf3/#NaBL2-IntTerm line 29_23">NaBL2-IntTerm</button>.<span class="cons_Constructor"><span id="Int_32_17" title="a definition with no references">Int</span></span> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-INT_9_3" id="NaBL2-INT_32_23" title="a reference to a single-file definition">NaBL2-INT</a>

<span class="keyword">syntax</span>
 
  <a href="#NaBL2-OpTerm_24_28" id="NaBL2-OpTerm_36_3" title="a definition with a single reference">NaBL2-OpTerm</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_36_19" title="a definition with no references">Op</span></span>      = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-OpId_22_3" id="NaBL2-OpId_36_29" title="a reference to a single-file definition">NaBL2-OpId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-Patterns_28_3" id="NaBL2-Patterns_36_59" title="a reference to a single-file definition">NaBL2-Patterns</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span>  <span class="cons_Lit">")"</span>

  <button class="modal-open" id="NaBL2-StringTerm_38_3" title="a definition with multiple references" data-urls="#NaBL2-StringTerm line 26_28; ../CTerms.sdf3/#NaBL2-StringTerm line 30_23; ../Messages.sdf3/#NaBL2-StringTerm line 19_35">NaBL2-StringTerm</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Str_38_23" title="a definition with no references">Str</span></span> = <span class="cons_Lit">"\""</span> <a href="#NaBL2-StringChars_42_3" id="NaBL2-StringChars_38_34" title="a reference to a single-file definition">NaBL2-StringChars</a><span class="keyword">-LEX</span> <span class="cons_Lit">"\""</span>
 
<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="NaBL2-StringChars_42_3" title="a definition with multiple references" data-urls="#NaBL2-StringChars line 38_34, 48_3">NaBL2-StringChars</button>   = <a href="#NaBL2-StringChar_43_3" id="NaBL2-StringChar_42_25" title="a reference to a single-file definition">NaBL2-StringChar</a>*
  <a href="#NaBL2-StringChar_42_25" id="NaBL2-StringChar_43_3" title="a definition with a single reference">NaBL2-StringChar</a>    = ~[\"\\\t\r\n]
  <a href="#NaBL2-StringChar_42_25" id="NaBL2-StringChar_44_3" title="a definition with a single reference">NaBL2-StringChar</a>    =  <span class="cons_Lit">"\\\""</span> | <span class="cons_Lit">"\\\\"</span> | <span class="cons_Lit">"\\t"</span> | <span class="cons_Lit">"\\r"</span> | <span class="cons_Lit">"\\n"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-StringChars_42_3" id="NaBL2-StringChars_48_3" title="a reference to a single-file definition">NaBL2-StringChars</a> -/- ~[\"]


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
