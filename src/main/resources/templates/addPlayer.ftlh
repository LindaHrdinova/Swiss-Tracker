[#ftl]

<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Swiss Tracker</title>
    <link rel="stylesheet" href="/style.css" type="text/css"/>
</head>
<body>
<main>
    <h1>Přidej hráče do turnaje</h1>
    <form method="post" action="/">
        <div class="formInput">
            <label for="playerId">ID *</label>
            <input type="number" name="playerId" required>

        </div>
        <div class="formInput">
            <label for="playerName">Jméno hráče *</label>
            <input type="text" name="playerName" required>

        </div>
        <div class="formInput">
            <label for="playerBirthday">Datum narození *</label>
            <input type="date" name="playerBirthday" required>
        </div>
        <div>
            <button type="submit">Přidat</button>
        </div>
    </form>
</main>
</body>
</html>