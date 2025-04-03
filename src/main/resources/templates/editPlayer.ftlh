[#ftl]
[@l.page title=" - upravit hráče"]
    <h1>Upravit hráče</h1>
        <form class="form" method="post" action="/editPlayer">
            <div class="form__inputBox">
                <label class="form__label" for="playerId">ID *</label>
                <input type="number" name="playerId" value="${player.playerId}" readonly>

            </div>
            <div class="form__inputBox">
                <label class="form__label" for="name">Jméno hráče *</label>
                <input type="text" name="name" value="${player.name}" required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="birthday">Datum narození *</label>
                <input type="date" name="birthday" value="${player.birthday}" required>
            </div>
            <div class="button-container">
                <button class="button" type="submit">Potvrdit změny</button>
            </div>
        </form>
[/@l.page]