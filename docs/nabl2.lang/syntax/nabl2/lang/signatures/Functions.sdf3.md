---
title: Functions.sdf3
hide:
  - toc
---

# `Functions.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/Functions.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/Functions.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/signatures/Functions.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/Functions_7_3" id="nabl2/lang/signatures/Functions_1_8" title="a definition with a single reference">nabl2/lang/signatures/Functions</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_5_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Functions.sdf3/#nabl2/shared/common/Functions_1_8" id="nabl2/shared/common/Functions_6_3" title="a reference to a single-file definition">nabl2/shared/common/Functions</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#nabl2/shared/common/Sorts_1_8" id="nabl2/shared/common/Sorts_7_3" title="a reference to a single-file definition">nabl2/shared/common/Sorts</a>
  <a href="../../common/CTerms.sdf3/#nabl2/lang/common/CTerms_1_8" id="nabl2/lang/common/CTerms_8_3" title="a reference to a single-file definition">nabl2/lang/common/CTerms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_16_3" title="a definition with no references">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Functions_16_19" title="a definition with no references">Functions</span></span> = &lt;
    <span class="cons_String">functions</span>
      &lt;{<a href="#NaBL2-FunctionDef_23_3" id="NaBL2-FunctionDef_18_9" title="a reference to a single-file definition">NaBL2-FunctionDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-FunctionDef_18_9" id="NaBL2-FunctionDef_23_3" title="a definition with a single reference">NaBL2-FunctionDef</a>.<span class="cons_Constructor"><span id="FunctionDef_23_21" title="a definition with no references">FunctionDef</span></span> = &lt;&lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Functions.sdf3/#NaBL2-Function_9_3" id="NaBL2-Function_23_37" title="a reference to a single-file definition">NaBL2-Function</a>&gt; &lt;<a href="#NaBL2-FunctionType_25_3" id="NaBL2-FunctionType_23_54" title="a reference to a single-file definition">NaBL2-FunctionType</a>&gt; &lt;<a href="#NaBL2-FunctionCases_27_3" id="NaBL2-FunctionCases_23_75" title="a reference to a single-file definition">NaBL2-FunctionCases</a>&gt;&gt;

  <a href="#NaBL2-FunctionType_23_54" id="NaBL2-FunctionType_25_3" title="a definition with a single reference">NaBL2-FunctionType</a>  = [<span class="cons_String">:</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_25_29" title="a reference to a single-file definition">NaBL2-SortRef</a>] <span class="cons_String">-&gt;</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_25_48" title="a reference to a single-file definition">NaBL2-SortRef</a>]]

  <a href="#NaBL2-FunctionCases_23_75" id="NaBL2-FunctionCases_27_3" title="a definition with a single reference">NaBL2-FunctionCases</a> = &lt;
    <span class="cons_String">{</span> &lt;{<a href="#NaBL2-FunctionCase_33_3" id="NaBL2-FunctionCase_28_9" title="a reference to a single-file definition">NaBL2-FunctionCase</a> <span class="cons_Lit">",\n"</span>}*&gt;
    <span class="cons_String">}</span>
  &gt;
  <a href="#NaBL2-FunctionCases_23_75" id="NaBL2-FunctionCases_31_3" title="a definition with a single reference">NaBL2-FunctionCases</a> = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
 
  <a href="#NaBL2-FunctionCase_28_9" id="NaBL2-FunctionCase_33_3" title="a definition with a single reference">NaBL2-FunctionCase</a>  = [[<a href="../../common/CTerms.sdf3/#NaBL2-CTerm_23_3" id="NaBL2-CTerm_33_27" title="a reference to a single-file definition">NaBL2-CTerm</a>] <span class="cons_String">-&gt;</span> [<a href="../../common/CTerms.sdf3/#NaBL2-CTerm_23_3" id="NaBL2-CTerm_33_44" title="a reference to a single-file definition">NaBL2-CTerm</a>]]

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-SectionKeyword_37_3" title="a definition with no references">NaBL2-SectionKeyword</span> = <span class="cons_Lit">"functions"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
