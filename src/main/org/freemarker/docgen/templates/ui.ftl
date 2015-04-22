<#ftl strip_text = true />

<#import "navigation.ftl" as nav>


<#macro siteHeader logo>
  <#-- put div for gray bg up here so we can use drop shadow -->
  <div class="header-bottom-bg">
    <div class="header-top-bg">
      <div class="site-header">
        <#-- keep site-width inside site-header so that the background extends -->
        <div class="site-width header-top">
          <#if logo??>
            <a class="logo" href="${logo.href?html}" role="banner"><#t>
              &lt;FreeMarker&gt;<#t>
              <#-- @todo: replace with new logo -->
              <#--<img src="${logo.src?html}" alt="${logo.alt?html}">-->
            </a><#t>
          </#if>
          <@nav.tabs />
        </div>
      </div>
    </div>
    <@categoryHeader />
  </div>
</#macro>


<#macro categoryHeader>
  <div class="site-width header-bottom">
    <div class="header-right">
      <@notices />
      <@searchForm />
    </div>
    <div class="header-left">
      <div class="category">Manual</div>
      <@nav.breadcrumb />
    </div>
  </div>
</#macro>


<#macro searchForm>
  <#-- @todo: replace with google search -->
  <#-- @todo: need flag to disable or enable search -->
  <#if !offline>
    <form class="search-form"><#t>
      <fieldset><#t>
        <legend class="sr-only">Search form</legend><#t>
        <label for="search-field" class="sr-only">Search query</label><#t>
        <input id="search-field" type="search" class="search-input" placeholder="Search" spellcheck="false" autocorrect="off"><#t>
        <button type="submit" class="search-btn"><span class="sr-only">Search</span></button><#t>
      </fieldset><#t>
    </form><#t>
  </#if>
</#macro>


<#macro notices>
  <p class="notices">
    <a href="javascript:;">Contributors wanted! <strong>Learn more</strong></a>
  </p>
</#macro>