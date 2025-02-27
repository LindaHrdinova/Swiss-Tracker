[#ftl]

[#macro page title]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Swiss Tracker ${title}</title>
    <link rel="stylesheet" href="/style.css" type="text/css"/>
</head>
<body>
<nav>
    <a href="/">Turnaj</a>
    <a href="/addPlayer">Přidat hráče</a>
    <a href="/playersList">Seznam hráčů</a>
</nav>
<main>
    [#nested]
</main>
</body>
</html>
[/#macro]