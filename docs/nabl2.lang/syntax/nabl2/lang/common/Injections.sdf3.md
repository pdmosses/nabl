---
title: Injections.sdf3
hide:
  - toc
---

# `Injections.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/Injections.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/Injections.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/common/Injections.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/common/Injections_1_8" title="a definition with multiple references" data-urls="../Main.sdf3/#nabl2/lang/common/Injections line 7_3; ../../rules/CGen.sdf3/#nabl2/lang/common/Injections line 10_3">nabl2/lang/common/Injections</button>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#nabl2/shared/common/CTerms_1_8" id="nabl2/shared/common/CTerms_5_3" title="a reference to a single-file definition">nabl2/shared/common/CTerms</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_6_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#nabl2/shared/common/Resolution_1_8" id="nabl2/shared/common/Resolution_7_3" title="a reference to a single-file definition">nabl2/shared/common/Resolution</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3/#nabl2/shared/common/ScopeGraph_1_8" id="nabl2/shared/common/ScopeGraph_8_3" title="a reference to a single-file definition">nabl2/shared/common/ScopeGraph</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3/#nabl2/shared/common/Sets_1_8" id="nabl2/shared/common/Sets_9_3" title="a reference to a single-file definition">nabl2/shared/common/Sets</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/constraints/Base.sdf3/#nabl2/shared/constraints/Base_1_8" id="nabl2/shared/constraints/Base_10_3" title="a reference to a single-file definition">nabl2/shared/constraints/Base</a>
  <a href="../Terms.sdf3/#nabl2/lang/common/Terms_1_8" id="nabl2/lang/common/Terms_11_3" title="a reference to a single-file definition">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="NaBL2-Message_19_3" title="a definition with multiple references" data-urls="#NaBL2-Message line 34_96, 36_64, 37_65, 43_118">NaBL2-Message</button>.<span class="cons_Constructor"><span id="DefaultMessage_19_17" title="a definition with no references">DefaultMessage</span></span> =

  <span id="NaBL2-MessagePosition_21_3" title="a definition with no references">NaBL2-MessagePosition</span>.<span class="cons_Constructor"><span id="DefaultMessagePosition_21_25" title="a definition with no references">DefaultMessagePosition</span></span> =
  <span id="NaBL2-MessagePosition_22_3" title="a definition with no references">NaBL2-MessagePosition</span>.<span class="cons_Constructor"><span id="MessagePositionFrom_22_25" title="a definition with no references">MessagePositionFrom</span></span>    = &lt; <span class="cons_String">@</span> &lt;<a href="../Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_22_55" title="a reference to a single-file definition">NaBL2-Var</a>&gt;&gt;

  <span id="NaBL2-OccurrenceIndex_24_3" title="a definition with no references">NaBL2-OccurrenceIndex</span>.<span class="cons_Constructor"><span id="DefaultOccurrenceIndex_24_25" title="a definition with no references">DefaultOccurrenceIndex</span></span> =
  <span id="NaBL2-OccurrenceIndex_25_3" title="a definition with no references">NaBL2-OccurrenceIndex</span>.<span class="cons_Constructor"><span id="OccurrenceIndexFrom_25_25" title="a definition with no references">OccurrenceIndexFrom</span></span>    = &lt; <span class="cons_String">@</span> &lt;<a href="../Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_25_55" title="a reference to a single-file definition">NaBL2-Var</a>&gt;&gt;

  <button class="modal-open" id="NaBL2-LabelRE_27_3" title="a definition with multiple references" data-urls="#NaBL2-LabelRE line 27_31, 28_31, 28_47, 29_30, 47_7, 47_29, 47_50, 48_14, 48_35, 49_5, 50_5">NaBL2-LabelRE</button>.<span class="cons_Constructor"><a href="#Option_47_43" id="Option_27_17" title="a definition with a single reference">Option</a></span>    = &lt;&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_27_31" title="a reference to a single-file definition">NaBL2-LabelRE</a>&gt;<span class="cons_String">?</span>&gt;
  <button class="modal-open" id="NaBL2-LabelRE_28_3" title="a definition with multiple references" data-urls="#NaBL2-LabelRE line 27_31, 28_31, 28_47, 29_30, 47_7, 47_29, 47_50, 48_14, 48_35, 49_5, 50_5">NaBL2-LabelRE</button>.<span class="cons_Constructor"><a href="#ConcatDot_48_49" id="ConcatDot_28_17" title="a definition with a single reference">ConcatDot</a></span> = &lt;&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_28_31" title="a reference to a single-file definition">NaBL2-LabelRE</a>&gt;<span class="cons_String">.</span>&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_28_47" title="a reference to a single-file definition">NaBL2-LabelRE</a>&gt;&gt;  {<span class="keyword">right</span>,<span class="keyword">deprecated</span>("The dot for concatenation is unnecessary, and can be omitted.")}
  <button class="modal-open" id="NaBL2-LabelRE_29_3" title="a definition with multiple references" data-urls="#NaBL2-LabelRE line 27_31, 28_31, 28_47, 29_30, 47_7, 47_29, 47_50, 48_14, 48_35, 49_5, 50_5">NaBL2-LabelRE</button>.<span class="cons_Constructor"><a href="#NonEmpty_47_64" id="NonEmpty_29_17" title="a definition with a single reference">NonEmpty</a></span> = &lt;&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_29_30" title="a reference to a single-file definition">NaBL2-LabelRE</a>&gt;<span class="cons_String">+</span>&gt;

  <span id="NaBL2-ELabel_31_3" title="a definition with no references">NaBL2-ELabel</span>.<span class="cons_Constructor"><span id="DefaultELabel_31_16" title="a definition with no references">DefaultELabel</span></span> = <span class="cons_Lit">"-"</span>
  <span id="NaBL2-NLabel_32_3" title="a definition with no references">NaBL2-NLabel</span>.<span class="cons_Constructor"><span id="DefaultNLabel_32_16" title="a definition with no references">DefaultNLabel</span></span> = <span class="cons_Lit">"="</span>

  <span id="NaBL2-Constraint_34_3" title="a definition with no references">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CDeclType_34_20" title="a definition with no references">CDeclType</span></span> = [[<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3/#NaBL2-Occurrence_23_3" id="NaBL2-Occurrence_34_34" title="a reference to a single-file definition">NaBL2-Occurrence</a>] <span class="cons_String">:</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerm_13_3" id="NaBL2-CTerm_34_55" title="a reference to a single-file definition">NaBL2-CTerm</a>] [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/constraints/Base.sdf3/#NaBL2-ConstraintPriority_44_3" id="NaBL2-ConstraintPriority_34_69" title="a reference to a single-file definition">NaBL2-ConstraintPriority</a>] [<a href="#NaBL2-Message_19_3" id="NaBL2-Message_34_96" title="a reference to a single-file definition">NaBL2-Message</a>]]

  <span id="NaBL2-Constraint_36_3" title="a definition with no references">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CGen_36_20" title="a definition with no references">CGen</span></span>  = [[<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerm_13_3" id="NaBL2-CTerm_36_30" title="a reference to a single-file definition">NaBL2-CTerm</a>] <span class="cons_String">genOf</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerm_13_3" id="NaBL2-CTerm_36_50" title="a reference to a single-file definition">NaBL2-CTerm</a>] [<a href="#NaBL2-Message_19_3" id="NaBL2-Message_36_64" title="a reference to a single-file definition">NaBL2-Message</a>]]
  <span id="NaBL2-Constraint_37_3" title="a definition with no references">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CInst_37_20" title="a definition with no references">CInst</span></span> = [[<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerm_13_3" id="NaBL2-CTerm_37_30" title="a reference to a single-file definition">NaBL2-CTerm</a>] <span class="cons_String">instOf</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerm_13_3" id="NaBL2-CTerm_37_51" title="a reference to a single-file definition">NaBL2-CTerm</a>] [<a href="#NaBL2-Message_19_3" id="NaBL2-Message_37_65" title="a reference to a single-file definition">NaBL2-Message</a>]]

<span class="keyword">syntax</span>

  <span id="NaBL2-TermIndex_41_3" title="a definition with no references">NaBL2-TermIndex</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TermIndexFrom_41_22" title="a definition with no references">TermIndexFrom</span></span> = <span class="cons_Lit">"@"</span> <a href="../Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_41_42" title="a reference to a single-file definition">NaBL2-Var</a><span class="keyword">-CF</span>

  <span id="NaBL2-Constraint_43_3" title="a definition with no references">NaBL2-Constraint</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CSetEq_43_23" title="a definition with no references">CSetEq</span></span> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3/#NaBL2-CSet_25_3" id="NaBL2-CSet_43_32" title="a reference to a single-file definition">NaBL2-CSet</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"seteq"</span> <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3/#NaBL2-SetProj_20_3" id="NaBL2-SetProj_43_65" title="a reference to a single-file definition">NaBL2-SetProj</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3/#NaBL2-CSet_25_3" id="NaBL2-CSet_43_93" title="a reference to a single-file definition">NaBL2-CSet</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-Message_19_3" id="NaBL2-Message_43_118" title="a reference to a single-file definition">NaBL2-Message</a><span class="keyword">-CF</span>

<span class="keyword">context-free priorities</span>

    { <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_47_7" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#Closure_46_17" id="Closure_47_21" title="a reference to a single-file definition">Closure</a></span> <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_47_29" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#Option_27_17" id="Option_47_43" title="a reference to a single-file definition">Option</a></span> <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_47_50" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#NonEmpty_29_17" id="NonEmpty_47_64" title="a reference to a single-file definition">NonEmpty</a></span> }
  &gt; { <span class="keyword">right</span>: <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_48_14" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#Concat_47_17" id="Concat_48_28" title="a reference to a single-file definition">Concat</a></span> <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_48_35" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#ConcatDot_28_17" id="ConcatDot_48_49" title="a reference to a single-file definition">ConcatDot</a></span> }
  &gt; <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_49_5" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#And_48_17" id="And_49_19" title="a reference to a single-file definition">And</a></span>
  &gt; <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_50_5" title="a reference to a single-file definition">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#Or_49_17" id="Or_50_19" title="a reference to a single-file definition">Or</a></span>

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-Keyword_54_3" title="a definition with no references">NaBL2-Keyword</span> = <span class="cons_Lit">"seteq"</span> | <span class="cons_Lit">"genOf"</span> | <span class="cons_Lit">"instOf"</span> | <span class="cons_Lit">"new"</span> | <span class="cons_Lit">"this"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
