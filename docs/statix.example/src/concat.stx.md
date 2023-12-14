---
title: concat.stx
hide:
  - toc
---

# `concat.stx`

:simple-github: [pdmosses/nabl/statix.example/src/concat.stx]

[pdmosses/nabl/statix.example/src/concat.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/concat.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="concat_1_8" title="Not referenced"><span class="token sort_Id">concat</span></span>

<span class="keyword">signature</span>
  <span class="keyword">constraints</span>
    <a href="#concatF_9_3" id="concatF_5_5" title="Referenced at line 9, 10"><span class="token sort_Id">concatF</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span>

<span class="keyword">rules</span>
  
  <a href="#concatF_5_5" id="concatF_9_3" title="Defined at line 5"><span class="token sort_Id">concatF</span></a><span class="operator">([],</span> <span class="cons_Var"><span id="ys_9_15" title="Not referenced"><span class="token sort_Id">ys</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">ys</span><span class="operator">.</span>
  <a href="#concatF_5_5" id="concatF_10_3" title="Defined at line 5"><span class="token sort_Id">concatF</span></a><span class="operator">([</span><span class="cons_Var"><span id="x_10_12" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">|</span><span class="cons_Var">xs</span><span class="operator">],</span> <span class="cons_Var">ys</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var">x</span><span class="operator">|</span><a href="#concatF_5_5" id="concatF_10_28" title="Defined at line 5"><span class="token sort_Id">concatF</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_10_36" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="ys_10_40" title="Not referenced"><span class="token sort_Id">ys</span></span></span><span class="operator">)].</span>

<span class="keyword">signature</span>
  <span class="keyword">constraints</span>
    <a href="#concatP_18_3" id="concatP_14_5" title="Referenced at line 18, 19"><span class="token sort_Id">concatP</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span>

<span class="keyword">rules</span>
  
  <a href="#concatP_14_5" id="concatP_18_3" title="Defined at line 14"><span class="token sort_Id">concatP</span></a><span class="operator">([],</span> <span class="cons_Var"><span id="ys_18_15" title="Not referenced"><span class="token sort_Id">ys</span></span></span><span class="operator">,</span> <span class="cons_Var">ys</span><span class="operator">).</span>
  <a href="#concatP_14_5" id="concatP_19_3" title="Defined at line 14"><span class="token sort_Id">concatP</span></a><span class="operator">([</span><span class="cons_Var">x</span><span class="operator">|</span><span class="cons_Var"><a href="#xs_19_42" id="xs_19_14" title="Referenced at line 19"><span class="token sort_Id">xs</span></a></span><span class="operator">],</span> <span class="cons_Var"><a href="#ys_19_46" id="ys_19_19" title="Referenced at line 19"><span class="token sort_Id">ys</span></a></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="x_19_24" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">|</span><span class="cons_Var"><a href="#zs_19_50" id="zs_19_26" title="Referenced at line 19"><span class="token sort_Id">zs</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#concatP_14_5" id="concatP_19_34" title="Defined at line 14"><span class="token sort_Id">concatP</span></a><span class="operator">(</span><span class="cons_Var"><a href="#xs_19_14" id="xs_19_42" title="Defined at line 19"><span class="token sort_Id">xs</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ys_19_19" id="ys_19_46" title="Defined at line 19"><span class="token sort_Id">ys</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#zs_19_26" id="zs_19_50" title="Defined at line 19"><span class="token sort_Id">zs</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
