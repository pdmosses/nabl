---
title: Relations.sdf3
hide:
  - toc
---

# `Relations.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/Relations_9_3" id="nabl2/lang/signatures/Relations_1_8" title="a definition with a single reference">nabl2/lang/signatures/Relations</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_5_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3/#nabl2/shared/common/Relations_1_8" id="nabl2/shared/common/Relations_6_3" title="a reference to a single-file definition">nabl2/shared/common/Relations</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#nabl2/shared/common/Sorts_1_8" id="nabl2/shared/common/Sorts_7_3" title="a reference to a single-file definition">nabl2/shared/common/Sorts</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_15_3" title="a definition with no references">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Relations_15_19" title="a definition with no references">Relations</span></span> = &lt;
    <span class="cons_String">relations</span>
      &lt;{<a href="#NaBL2-RelationDef_22_3" id="NaBL2-RelationDef_17_9" title="a reference to a single-file definition">NaBL2-RelationDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-RelationDef_17_9" id="NaBL2-RelationDef_22_3" title="a definition with a single reference">NaBL2-RelationDef</a>.<span class="cons_Constructor"><span id="RelationDef_22_21" title="a definition with no references">RelationDef</span></span> = &lt;&lt;{<a href="#NaBL2-RelationOption_24_3" id="NaBL2-RelationOption_22_38" title="a reference to a single-file definition">NaBL2-RelationOption</a> <span class="cons_Lit">", "</span>}*&gt; &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3/#NaBL2-Relation_22_3" id="NaBL2-Relation_22_68" title="a reference to a single-file definition">NaBL2-Relation</a>&gt; &lt;<a href="#NaBL2-RelationType_28_3" id="NaBL2-RelationType_22_85" title="a reference to a single-file definition">NaBL2-RelationType</a>&gt; &lt;<a href="#NaBL2-VariancePatterns_30_3" id="NaBL2-VariancePatterns_22_106" title="a reference to a single-file definition">NaBL2-VariancePatterns</a>&gt;&gt;

  <a href="#NaBL2-RelationOption_22_38" id="NaBL2-RelationOption_24_3" title="a definition with a single reference">NaBL2-RelationOption</a> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3/#NaBL2-Reflexivity_13_3" id="NaBL2-Reflexivity_24_26" title="a reference to a single-file definition">NaBL2-Reflexivity</a>
  <a href="#NaBL2-RelationOption_22_38" id="NaBL2-RelationOption_25_3" title="a definition with a single reference">NaBL2-RelationOption</a> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3/#NaBL2-Symmetry_16_3" id="NaBL2-Symmetry_25_26" title="a reference to a single-file definition">NaBL2-Symmetry</a>
  <a href="#NaBL2-RelationOption_22_38" id="NaBL2-RelationOption_26_3" title="a definition with a single reference">NaBL2-RelationOption</a> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3/#NaBL2-Transitivity_19_3" id="NaBL2-Transitivity_26_26" title="a reference to a single-file definition">NaBL2-Transitivity</a>

  <a href="#NaBL2-RelationType_22_85" id="NaBL2-RelationType_28_3" title="a definition with a single reference">NaBL2-RelationType</a> = &lt;<span class="cons_String">:</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_28_28" title="a reference to a single-file definition">NaBL2-SortRef</a>&gt; <span class="cons_String">*</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_28_46" title="a reference to a single-file definition">NaBL2-SortRef</a>&gt;&gt;

  <a href="#NaBL2-VariancePatterns_22_106" id="NaBL2-VariancePatterns_30_3" title="a definition with a single reference">NaBL2-VariancePatterns</a>      = &lt;<span class="cons_String">{</span> &lt;{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3/#NaBL2-VariancePattern_42_3" id="NaBL2-VariancePattern_30_38" title="a reference to a single-file definition">NaBL2-VariancePattern</a> <span class="cons_Lit">",\n"</span>}*&gt; <span class="cons_String">}</span>&gt;
  <a href="#NaBL2-VariancePatterns_22_106" id="NaBL2-VariancePatterns_31_3" title="a definition with a single reference">NaBL2-VariancePatterns</a>      = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
 
 <span class="keyword">lexical syntax</span>
 
  <span id="NaBL2-Keyword_35_3" title="a definition with no references">NaBL2-Keyword</span> = <span class="cons_Lit">"relations"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
