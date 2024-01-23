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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/common/Injections_1_8" title="Multi-file references" data-urls="../Main.sdf3/#nabl2/lang/common/Injections_7_3 line 7; ../../rules/CGen.sdf3/#nabl2/lang/common/Injections_10_3 line 10">nabl2/lang/common/Injections</button>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/CTerms</span>
  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/Resolution</span>
  <span title="External reference">nabl2/shared/common/ScopeGraph</span>
  <span title="External reference">nabl2/shared/common/Sets</span>
  <span title="External reference">nabl2/shared/constraints/Base</span>
  <a href="../Terms.sdf3/#nabl2/lang/common/Terms_1_8" id="nabl2/lang/common/Terms_11_3" title="Defined at ../Terms.sdf3 line 1">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-Message_34_96" id="NaBL2-Message_19_3" title="Referenced at line 34, 36, 37, 43">NaBL2-Message</a>.<span class="cons_Constructor"><span id="DefaultMessage_19_17" title="Not referenced">DefaultMessage</span></span> =

  <span id="NaBL2-MessagePosition_21_3" title="Not referenced">NaBL2-MessagePosition</span>.<span class="cons_Constructor"><span id="DefaultMessagePosition_21_25" title="Not referenced">DefaultMessagePosition</span></span> =
  <span id="NaBL2-MessagePosition_22_3" title="Not referenced">NaBL2-MessagePosition</span>.<span class="cons_Constructor"><span id="MessagePositionFrom_22_25" title="Not referenced">MessagePositionFrom</span></span>    = &lt; <span class="cons_String">@</span> &lt;<a href="../Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_22_55" title="Defined at ../Terms.sdf3 line 13">NaBL2-Var</a>&gt;&gt;

  <span id="NaBL2-OccurrenceIndex_24_3" title="Not referenced">NaBL2-OccurrenceIndex</span>.<span class="cons_Constructor"><span id="DefaultOccurrenceIndex_24_25" title="Not referenced">DefaultOccurrenceIndex</span></span> =
  <span id="NaBL2-OccurrenceIndex_25_3" title="Not referenced">NaBL2-OccurrenceIndex</span>.<span class="cons_Constructor"><span id="OccurrenceIndexFrom_25_25" title="Not referenced">OccurrenceIndexFrom</span></span>    = &lt; <span class="cons_String">@</span> &lt;<a href="../Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_25_55" title="Defined at ../Terms.sdf3 line 13">NaBL2-Var</a>&gt;&gt;

  <a href="#NaBL2-LabelRE_27_31" id="NaBL2-LabelRE_27_3" title="Referenced at line 27, 28, 29, 47, 48, 49, 50">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#Option_47_43" id="Option_27_17" title="Referenced at line 47">Option</a></span>    = &lt;&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_27_31" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;<span class="cons_String">?</span>&gt;
  <a href="#NaBL2-LabelRE_27_31" id="NaBL2-LabelRE_28_3" title="Referenced at line 27, 28, 29, 47, 48, 49, 50">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#ConcatDot_48_49" id="ConcatDot_28_17" title="Referenced at line 48">ConcatDot</a></span> = &lt;&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_28_31" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;<span class="cons_String">.</span>&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_28_47" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;&gt;  {<span class="keyword">right</span>,<span class="keyword">deprecated</span>("The dot for concatenation is unnecessary, and can be omitted.")}
  <a href="#NaBL2-LabelRE_27_31" id="NaBL2-LabelRE_29_3" title="Referenced at line 27, 28, 29, 47, 48, 49, 50">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#NonEmpty_47_64" id="NonEmpty_29_17" title="Referenced at line 47">NonEmpty</a></span> = &lt;&lt;<a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_29_30" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;<span class="cons_String">+</span>&gt;

  <span id="NaBL2-ELabel_31_3" title="Not referenced">NaBL2-ELabel</span>.<span class="cons_Constructor"><span id="DefaultELabel_31_16" title="Not referenced">DefaultELabel</span></span> = <span class="cons_Lit">"-"</span>
  <span id="NaBL2-NLabel_32_3" title="Not referenced">NaBL2-NLabel</span>.<span class="cons_Constructor"><span id="DefaultNLabel_32_16" title="Not referenced">DefaultNLabel</span></span> = <span class="cons_Lit">"="</span>

  <span id="NaBL2-Constraint_34_3" title="Not referenced">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CDeclType_34_20" title="Not referenced">CDeclType</span></span> = [[<span title="External reference">NaBL2-Occurrence</span>] <span class="cons_String">:</span> [<span title="External reference">NaBL2-CTerm</span>] [<span title="External reference">NaBL2-ConstraintPriority</span>] [<a href="#NaBL2-Message_19_3" id="NaBL2-Message_34_96" title="Defined at line 19">NaBL2-Message</a>]]

  <span id="NaBL2-Constraint_36_3" title="Not referenced">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CGen_36_20" title="Not referenced">CGen</span></span>  = [[<span title="External reference">NaBL2-CTerm</span>] <span class="cons_String">genOf</span> [<span title="External reference">NaBL2-CTerm</span>] [<a href="#NaBL2-Message_19_3" id="NaBL2-Message_36_64" title="Defined at line 19">NaBL2-Message</a>]]
  <span id="NaBL2-Constraint_37_3" title="Not referenced">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CInst_37_20" title="Not referenced">CInst</span></span> = [[<span title="External reference">NaBL2-CTerm</span>] <span class="cons_String">instOf</span> [<span title="External reference">NaBL2-CTerm</span>] [<a href="#NaBL2-Message_19_3" id="NaBL2-Message_37_65" title="Defined at line 19">NaBL2-Message</a>]]

<span class="keyword">syntax</span>

  <span id="NaBL2-TermIndex_41_3" title="Not referenced">NaBL2-TermIndex</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TermIndexFrom_41_22" title="Not referenced">TermIndexFrom</span></span> = <span class="cons_Lit">"@"</span> <a href="../Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_41_42" title="Defined at ../Terms.sdf3 line 13">NaBL2-Var</a><span class="keyword">-CF</span>

  <span id="NaBL2-Constraint_43_3" title="Not referenced">NaBL2-Constraint</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CSetEq_43_23" title="Not referenced">CSetEq</span></span> = <span title="External reference">NaBL2-CSet</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"seteq"</span> <span title="External reference">NaBL2-SetProj</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span title="External reference">NaBL2-CSet</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-Message_19_3" id="NaBL2-Message_43_118" title="Defined at line 19">NaBL2-Message</a><span class="keyword">-CF</span>

<span class="keyword">context-free priorities</span>

    { <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_47_7" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">Closure</span></span> <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_47_29" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#Option_27_17" id="Option_47_43" title="Defined at line 27">Option</a></span> <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_47_50" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#NonEmpty_29_17" id="NonEmpty_47_64" title="Defined at line 29">NonEmpty</a></span> }
  &gt; { <span class="keyword">right</span>: <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_48_14" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">Concat</span></span> <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_48_35" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#ConcatDot_28_17" id="ConcatDot_48_49" title="Defined at line 28">ConcatDot</a></span> }
  &gt; <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_49_5" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">And</span></span>
  &gt; <a href="#NaBL2-LabelRE_27_3" id="NaBL2-LabelRE_50_5" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">Or</span></span>

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-Keyword_54_3" title="Not referenced">NaBL2-Keyword</span> = <span class="cons_Lit">"seteq"</span> | <span class="cons_Lit">"genOf"</span> | <span class="cons_Lit">"instOf"</span> | <span class="cons_Lit">"new"</span> | <span class="cons_Lit">"this"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
