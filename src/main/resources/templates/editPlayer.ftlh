[#ftl]
[@l.page title=" - upravit hráče"]
    <h1>Upravit hráče</h1>
        <form class="form" method="post" action="/editPlayer">
            <div class="form__inputBox">
                <label class="form__label" for="playerId">ID *</label>
                <input type="number" name="playerId" value="${player.playerId}" readonly>

            </div>
            <div class="form__inputBox">
                <label class="form__label" for="playerName">Jméno hráče *</label>
                <input type="text" name="playerName" value="${player.playerName}" required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="playerBirthday">Datum narození *</label>
                <input type="date" name="playerBirthday" value="${player.playerBirthday}" required>
            </div>
            <div class="button-container">
                <button class="button" type="submit">Potvrdit změny</button>
            </div>
        </form>
[/@l.page]