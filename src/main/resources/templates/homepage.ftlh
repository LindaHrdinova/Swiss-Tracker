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
    <h1>Vítej v turnaji!</h1>
    <form method="post" action="/">
        <div class="formInput">
            <label for="turnamentName">Název turnaje *</label>
            <input type="text" name="turnamentName" required>
        </div>
        <div class="formInput">
            <label for="organisedBy">Pořadatel *</label>
            <input type="text" name="organisedBy" required>
        </div>
        <div class="formInput">
            <label for="turnamentDate">Datum turnaje</label>
            <input type="date" name="turnamentDate">
        </div>
        <div class="formInput">
            <label for="turnamentType">Typ turnaje *</label>
            <select name="turnamentType" required>
                <option value="pokemon">Pokémon</option>
            </select>
        </div>
        <div class="formInput">
            <label for="turnamentRoundsNumber">Počet kol *</label>
            <input type="number" min="1" max="10" name="turnamentRoundsNumber" required>
        </div>
        <div>
            <button type="submit">Pokračovat</button>
        </div>
    </form>
</main>
</body>
</html>