---
title: Injections.sdf3
hide:
  - toc
---

# `Injections.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Injections.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Injections.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Injections.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../rules/CGen.sdf3#nabl2/lang/common/Injections_170_198" id="nabl2/lang/common/Injections_7_35" title="Referenced at ../../rules/CGen.sdf3 line 10">nabl2/lang/common/Injections</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/CTerms</span>
  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/Resolution</span>
  <span title="External reference">nabl2/shared/common/ScopeGraph</span>
  <span title="External reference">nabl2/shared/common/Sets</span>
  <span title="External reference">nabl2/shared/constraints/Base</span>
  <a href="../Terms.sdf3#nabl2/lang/common/Terms_7_30" id="nabl2/lang/common/Terms_236_259" title="Defined at ../Terms.sdf3 line 1">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-Message_1361_1374" id="NaBL2-Message_333_346" title="Referenced at line 43">NaBL2-Message</a>.<span class="cons_Constructor"><span id="DefaultMessage_347_361" title="Not referenced locally, nor via imports">DefaultMessage</span></span> =

  <span id="NaBL2-MessagePosition_367_388" title="Not referenced locally, nor via imports">NaBL2-MessagePosition</span>.<span class="cons_Constructor"><span id="DefaultMessagePosition_389_411" title="Not referenced locally, nor via imports">DefaultMessagePosition</span></span> =
  <span id="NaBL2-MessagePosition_416_437" title="Not referenced locally, nor via imports">NaBL2-MessagePosition</span>.<span class="cons_Constructor"><span id="MessagePositionFrom_438_457" title="Not referenced locally, nor via imports">MessagePositionFrom</span></span>    = &lt; <span class="cons_String">@</span> &lt;<a href="../Terms.sdf3#NaBL2-Var_146_155" id="NaBL2-Var_468_477" title="Defined at ../Terms.sdf3 line 13">NaBL2-Var</a>&gt;&gt;

  <span id="NaBL2-OccurrenceIndex_483_504" title="Not referenced locally, nor via imports">NaBL2-OccurrenceIndex</span>.<span class="cons_Constructor"><span id="DefaultOccurrenceIndex_505_527" title="Not referenced locally, nor via imports">DefaultOccurrenceIndex</span></span> =
  <span id="NaBL2-OccurrenceIndex_532_553" title="Not referenced locally, nor via imports">NaBL2-OccurrenceIndex</span>.<span class="cons_Constructor"><span id="OccurrenceIndexFrom_554_573" title="Not referenced locally, nor via imports">OccurrenceIndexFrom</span></span>    = &lt; <span class="cons_String">@</span> &lt;<a href="../Terms.sdf3#NaBL2-Var_146_155" id="NaBL2-Var_584_593" title="Defined at ../Terms.sdf3 line 13">NaBL2-Var</a>&gt;&gt;

  <a href="#NaBL2-LabelRE_1564_1577" id="NaBL2-LabelRE_599_612" title="Referenced at line 50">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#Option_1446_1452" id="Option_613_619" title="Referenced at line 47">Option</a></span>    = &lt;&lt;<a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_627_640" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;<span class="cons_String">?</span>&gt;
  <a href="#NaBL2-LabelRE_1564_1577" id="NaBL2-LabelRE_646_659" title="Referenced at line 50">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#ConcatDot_1526_1535" id="ConcatDot_660_669" title="Referenced at line 48">ConcatDot</a></span> = &lt;&lt;<a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_674_687" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;<span class="cons_String">.</span>&lt;<a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_690_703" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;&gt;  {<span class="keyword">right</span>,<span class="keyword">deprecated</span>("The dot for concatenation is unnecessary, and can be omitted.")}
  <a href="#NaBL2-LabelRE_1564_1577" id="NaBL2-LabelRE_793_806" title="Referenced at line 50">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#NonEmpty_1467_1475" id="NonEmpty_807_815" title="Referenced at line 47">NonEmpty</a></span> = &lt;&lt;<a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_820_833" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>&gt;<span class="cons_String">+</span>&gt;

  <span id="NaBL2-ELabel_840_852" title="Not referenced locally, nor via imports">NaBL2-ELabel</span>.<span class="cons_Constructor"><span id="DefaultELabel_853_866" title="Not referenced locally, nor via imports">DefaultELabel</span></span> = <span class="cons_Lit">"-"</span>
  <span id="NaBL2-NLabel_875_887" title="Not referenced locally, nor via imports">NaBL2-NLabel</span>.<span class="cons_Constructor"><span id="DefaultNLabel_888_901" title="Not referenced locally, nor via imports">DefaultNLabel</span></span> = <span class="cons_Lit">"="</span>

  <span id="NaBL2-Constraint_911_927" title="Not referenced locally, nor via imports">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CDeclType_928_937" title="Not referenced locally, nor via imports">CDeclType</span></span> = [[<span title="External reference">NaBL2-Occurrence</span>] <span class="cons_String">:</span> [<span title="External reference">NaBL2-CTerm</span>] [<span title="External reference">NaBL2-ConstraintPriority</span>] [<a href="#NaBL2-Message_333_346" id="NaBL2-Message_1004_1017" title="Defined at line 19">NaBL2-Message</a>]]

  <span id="NaBL2-Constraint_1023_1039" title="Not referenced locally, nor via imports">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CGen_1040_1044" title="Not referenced locally, nor via imports">CGen</span></span>  = [[<span title="External reference">NaBL2-CTerm</span>] <span class="cons_String">genOf</span> [<span title="External reference">NaBL2-CTerm</span>] [<a href="#NaBL2-Message_333_346" id="NaBL2-Message_1084_1097" title="Defined at line 19">NaBL2-Message</a>]]
  <span id="NaBL2-Constraint_1102_1118" title="Not referenced locally, nor via imports">NaBL2-Constraint</span>.<span class="cons_Constructor"><span id="CInst_1119_1124" title="Not referenced locally, nor via imports">CInst</span></span> = [[<span title="External reference">NaBL2-CTerm</span>] <span class="cons_String">instOf</span> [<span title="External reference">NaBL2-CTerm</span>] [<a href="#NaBL2-Message_333_346" id="NaBL2-Message_1164_1177" title="Defined at line 19">NaBL2-Message</a>]]

<span class="keyword">syntax</span>

  <span id="NaBL2-TermIndex_1191_1206" title="Not referenced locally, nor via imports">NaBL2-TermIndex</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TermIndexFrom_1210_1223" title="Not referenced locally, nor via imports">TermIndexFrom</span></span> = <span class="cons_Lit">"@"</span> <a href="../Terms.sdf3#NaBL2-Var_146_155" id="NaBL2-Var_1230_1239" title="Defined at ../Terms.sdf3 line 13">NaBL2-Var</a><span class="keyword">-CF</span>

  <span id="NaBL2-Constraint_1246_1262" title="Not referenced locally, nor via imports">NaBL2-Constraint</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CSetEq_1266_1272" title="Not referenced locally, nor via imports">CSetEq</span></span> = <span title="External reference">NaBL2-CSet</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"seteq"</span> <span title="External reference">NaBL2-SetProj</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span title="External reference">NaBL2-CSet</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-Message_333_346" id="NaBL2-Message_1361_1374" title="Defined at line 19">NaBL2-Message</a><span class="keyword">-CF</span>

<span class="keyword">context-free priorities</span>

    { <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1410_1423" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">Closure</span></span> <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1432_1445" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#Option_613_619" id="Option_1446_1452" title="Defined at line 27">Option</a></span> <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1453_1466" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#NonEmpty_807_815" id="NonEmpty_1467_1475" title="Defined at line 29">NonEmpty</a></span> }
  &gt; { <span class="keyword">right</span>: <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1491_1504" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">Concat</span></span> <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1512_1525" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><a href="#ConcatDot_660_669" id="ConcatDot_1526_1535" title="Defined at line 28">ConcatDot</a></span> }
  &gt; <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1542_1555" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">And</span></span>
  &gt; <a href="#NaBL2-LabelRE_599_612" id="NaBL2-LabelRE_1564_1577" title="Defined at line 27, 28, 29">NaBL2-LabelRE</a>.<span class="cons_Constructor"><span title="External reference">Or</span></span>

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-Keyword_1600_1613" title="Not referenced locally, nor via imports">NaBL2-Keyword</span> = <span class="cons_Lit">"seteq"</span> | <span class="cons_Lit">"genOf"</span> | <span class="cons_Lit">"instOf"</span> | <span class="cons_Lit">"new"</span> | <span class="cons_Lit">"this"</span>

</code></pre></td></tr></tbody></table></div>