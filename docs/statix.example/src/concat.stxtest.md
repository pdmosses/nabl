---
title: concat.stxtest
hide:
  - toc
---

# `concat.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/concat.stxtest]

[pdmosses/nabl/statix.example/src/concat.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/concat.stxtest "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">resolve</span> <span class="operator">{</span><span class="cons_Var"><a href="#l_3_71" id="l_1_10" title="Referenced at line 3"><span class="token sort_Id">l</span></a></span><span class="operator">}</span>

  <a href="#concat_7_5" id="concat_3_3" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">([</span><span class="cons_Str"><span class="operator">"</span>I'm"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>afraid"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>I"</span><span class="operator">],</span> <span class="operator">[</span><span class="cons_Str"><span class="operator">"</span>cannot"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>do"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>that"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>Dave"</span><span class="operator">])</span> <span class="operator">==</span> <span class="cons_Var"><a href="#l_1_10" id="l_3_71" title="Defined at line 1"><span class="token sort_Id">l</span></a></span>

<span class="keyword">signature</span>
  <span class="keyword">constraints</span>
    <a href="#concat_3_3" id="concat_7_5" title="Referenced at line 3, 11, 12"><span class="token sort_Id">concat</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span>

<span class="keyword">rules</span>

  <a href="#concat_7_5" id="concat_11_3" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">([],</span> <span class="cons_Var"><a href="#ys_11_26" id="ys_11_14" title="Referenced at line 11"><span class="token sort_Id">ys</span></a></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#zs_11_32" id="zs_11_20" title="Referenced at line 11"><span class="token sort_Id">zs</span></a></span> <span class="operator">:-</span> <span class="cons_Var"><a href="#ys_11_14" id="ys_11_26" title="Defined at line 11"><span class="token sort_Id">ys</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#zs_11_20" id="zs_11_32" title="Defined at line 11"><span class="token sort_Id">zs</span></a></span><span class="operator">.</span>
  <a href="#concat_7_5" id="concat_12_3" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">([</span><span class="cons_Var"><span id="x_12_11" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="xs_12_13" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">],</span> <span class="cons_Var"><span id="ys_12_18" title="Not referenced"><span class="token sort_Id">ys</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var">x</span><span class="operator">|</span><a href="#concat_7_5" id="concat_12_27" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">(</span><span class="cons_Var">xs</span><span class="operator">,</span> <span class="cons_Var">ys</span><span class="operator">)].</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
