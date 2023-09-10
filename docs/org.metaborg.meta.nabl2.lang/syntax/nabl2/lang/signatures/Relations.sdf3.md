---
title: Relations.sdf3
---

# `Relations.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3#nabl2/lang/signatures/Relations_190_221" id="nabl2/lang/signatures/Relations_7_38" title="Referenced at ../Signature.sdf3 line 9">nabl2/lang/signatures/Relations</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3#nabl2/shared/common/Identifiers_7_38" id="nabl2/shared/common/Identifiers_51_82" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3 line 1">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3#nabl2/shared/common/Relations_7_36" id="nabl2/shared/common/Relations_85_114" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3 line 1">nabl2/shared/common/Relations</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#nabl2/shared/common/Sorts_7_32" id="nabl2/shared/common/Sorts_117_142" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 1">nabl2/shared/common/Sorts</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_216_231" title="Not referenced locally, nor via imports">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Relations_232_241" title="Not referenced locally, nor via imports">Relations</span></span> = &lt;
    <span class="cons_String">relations</span>
      &lt;{<a href="#NaBL2-RelationDef_340_357" id="NaBL2-RelationDef_268_285" title="Defined at line 22">NaBL2-RelationDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-RelationDef_268_285" id="NaBL2-RelationDef_340_357" title="Referenced at line 17">NaBL2-RelationDef</a>.<span class="cons_Constructor"><span id="RelationDef_358_369" title="Not referenced locally, nor via imports">RelationDef</span></span> = &lt;&lt;{<a href="#NaBL2-RelationOption_471_491" id="NaBL2-RelationOption_375_395" title="Defined at line 24, 25, 26">NaBL2-RelationOption</a> <span class="cons_Lit">", "</span>}*&gt; &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3#NaBL2-Relation_477_491" id="NaBL2-Relation_405_419" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3 line 22">NaBL2-Relation</a>&gt; &lt;<a href="#NaBL2-RelationType_599_617" id="NaBL2-RelationType_422_440" title="Defined at line 28">NaBL2-RelationType</a>&gt; &lt;<a href="#NaBL2-VariancePatterns_661_683" id="NaBL2-VariancePatterns_443_465" title="Defined at line 30, 31">NaBL2-VariancePatterns</a>&gt;&gt;

  <a href="#NaBL2-RelationOption_375_395" id="NaBL2-RelationOption_471_491" title="Referenced at line 22">NaBL2-RelationOption</a> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3#NaBL2-Reflexivity_154_171" id="NaBL2-Reflexivity_494_511" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3 line 13, 14">NaBL2-Reflexivity</a>
  <a href="#NaBL2-RelationOption_375_395" id="NaBL2-RelationOption_514_534" title="Referenced at line 22">NaBL2-RelationOption</a> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3#NaBL2-Symmetry_259_273" id="NaBL2-Symmetry_537_551" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3 line 16, 17">NaBL2-Symmetry</a>
  <a href="#NaBL2-RelationOption_375_395" id="NaBL2-RelationOption_554_574" title="Referenced at line 22">NaBL2-RelationOption</a> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3#NaBL2-Transitivity_369_387" id="NaBL2-Transitivity_577_595" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3 line 19, 20">NaBL2-Transitivity</a>

  <a href="#NaBL2-RelationType_422_440" id="NaBL2-RelationType_599_617" title="Referenced at line 22">NaBL2-RelationType</a> = &lt;<span class="cons_String">:</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#NaBL2-SortRef_194_207" id="NaBL2-SortRef_624_637" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 15, 16, 17, 18, 19, 20, 21, 22, 23">NaBL2-SortRef</a>&gt; <span class="cons_String">*</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#NaBL2-SortRef_194_207" id="NaBL2-SortRef_642_655" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 15, 16, 17, 18, 19, 20, 21, 22, 23">NaBL2-SortRef</a>&gt;&gt;

  <a href="#NaBL2-VariancePatterns_443_465" id="NaBL2-VariancePatterns_661_683" title="Referenced at line 22">NaBL2-VariancePatterns</a>      = &lt;<span class="cons_String">{</span> &lt;{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3#NaBL2-VariancePattern_1065_1086" id="NaBL2-VariancePattern_696_717" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Relations.sdf3 line 42, 43, 49">NaBL2-VariancePattern</a> <span class="cons_Lit">",\n"</span>}*&gt; <span class="cons_String">}</span>&gt;
  <a href="#NaBL2-VariancePatterns_443_465" id="NaBL2-VariancePatterns_732_754" title="Referenced at line 22">NaBL2-VariancePatterns</a>      = {ast("[]")}
 
 <span class="keyword">lexical syntax</span>
 
  <span id="NaBL2-Keyword_796_809" title="Not referenced locally, nor via imports">NaBL2-Keyword</span> = <span class="cons_Lit">"relations"</span>

</code></pre></td></tr></tbody></table></div>