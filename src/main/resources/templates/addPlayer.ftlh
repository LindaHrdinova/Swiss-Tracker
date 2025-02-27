[#ftl]
[@l.page title=" - přidat hráče"]
    <h1>Přidej hráče do turnaje</h1>
    <form method="post" action="/addPlayer">
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
[/@l.page]